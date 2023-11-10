package study05.Homework5;

import java.util.Scanner;

public class Homework6 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework6 obj = new Homework6();
		//obj.method1(); // 입력된 수의 구구단 단수 출력
		//obj.method2(); // 가로로 2단부터 9단까지 출력
		obj.method3(); // 입력한 단수 빼고 출력
	}

	private void method3() {
		// method2 와 같이 가로로 출력하긴 하는데
		// 입력한 수는 빼고 출력
		System.out.println("제외 할 구구단 단수를 입력 : ");
		int input = sc.nextInt();
		
		for(int gop = 2; gop <= 9; gop++) {
			for(int dan = 2; dan <= 9; dan++) {
				if(dan == input) continue;
				System.out.print(dan + " x " + gop + " = " + (dan * gop) + "\t");
			}
			System.out.print("\n");
		}
	}

	private void method2() {
		// 가로로 출력
		// 2x2=2 3x2=3 4x2=8 5x2=10 6x2=12 7x2=14 8x2=16 9x2=18
		for(int gop = 2; gop <= 9; gop++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + " x " + gop + " = " + (dan * gop) + "\t");
			}
			System.out.print("\n");
		}
	}

	private void method1() {
		System.out.println("출력 할 구구단 단수를 입력 : ");
		int dan = sc.nextInt();
		
		// 입력된 수는 input x i = 결과 이다
		// 2단부터 9단까지 출력된다.
		// i 가 반복된다
		
		for(int gop = 2; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + (dan * gop));
		}
	}
}
