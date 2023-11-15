package study06.Homework06;

import java.util.Scanner;

/*
	 정수형 원점의 좌표(x,y)와 
	 실수 타입의 가로와 세로를 입력받아 
	 사각형을 만드는 클래스를 설계하고, 
	3개의 사각형을 만든 뒤 
	첫 번째 사각형에 
	나머지 두 개의 사각형이 포함되었는지 (중첩되지 않고)
	여부를 판단할 수 있는 메서드를 포함시키시오.
	
	x,y 중심
	x, y+h/2 중심위
	x-w/2, y+h/2 사각형 좌상 좌표
	x+w/2, y+h/2 사각형 우상 좌표
	x-w/2, y-h/2 사각형 좌하 좌표
	x+w/2, y-h/2 사각형 우하 좌표
	
 */
public class Square {
	Scanner sc;

	double x; // 중심점 x 좌표 받기
	double y; // 중심점 y 좌표 받기
	double w; // 가로폭 받기
	double h; // 세로폭 받기

	// 사각좌표 객체
	Point point1;
	Point point2;
	Point point3;
	Point point4;

	// 생성자
	public Square() {
		point1 = new Point();
		point2 = new Point();
		point3 = new Point();
		point4 = new Point();
	}

	// 사각형 좌표 입력 받기
	public void setSq() {
		sc = new Scanner(System.in);

		System.out.println("사각형의 x, y 중심좌표를 입력하시오 : ");
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
		System.out.println("가로 폭과 세로폭을 입력하시오 :");
		this.w = sc.nextDouble();
		this.h = sc.nextDouble();
	}

	// 사각형 좌표 만들기
	public void makeSq() {
		this.point1.x = -this.x - this.w / 2; // 사각형 좌상 좌표
		this.point1.y = this.y + this.h / 2;
		this.point2.x = this.x + this.w / 2; // 사각형 우상 좌표
		this.point2.y = this.y + this.h / 2;
		this.point3.x = -this.x - this.w / 2; // 사각형 좌하 좌표
		this.point3.y = -this.y - this.h / 2;
		this.point4.x = this.x + this.w / 2; // 사각형 우하 좌표
		this.point4.y = -this.y - this.h / 2;
	};

	// 사각형 좌표 출력하기
	public void printSq() {
		System.out.print("(" + this.point1.x + ",\t" + this.point1.y + ")" + "\t" + "(" + this.point2.x + ",\t"
				+ this.point2.y + ")\n");
		System.out.print("(" + this.point3.x + ",\t" + this.point3.y + ")" + "\t" + "(" + this.point4.x + ",\t"
				+ this.point4.y + ")\n");
	}
}
