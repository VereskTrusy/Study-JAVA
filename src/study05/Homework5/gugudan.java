package study05.Homework5;

import java.util.Scanner;

public class gugudan {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		gugudan obj = new gugudan();
		//obj.method1(); // 입력된 수의 구구단 단수 출력
		//obj.method2(); // 가로로 2단부터 9단까지 출력
		obj.method3(); // 입력한 단수 빼고 출력
	}

	private void method3() {
		// method2 와 같이 가로로 출력하긴 하는데
		// 입력한 수는 빼고 출력
		System.out.println("제외 할 구구단 단수를 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				if(j == input) continue;
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.print("\n");
		}
	}

	private void method2() {
		// 가로로 출력
		// 2x2=2 3x2=3 4x2=8 5x2=10 6x2=12 7x2=14 8x2=16 9x2=18
		for(int i = 2; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.print("\n");
		}
	}

	private void method1() {
		System.out.println("출력 할 구구단 단수를 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 수는 input x i = 결과 이다
		// 2단부터 9단까지 출력된다.
		// i 가 반복된다
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(input + " x " + i + " = " + (input * i));
		}
	}
}
