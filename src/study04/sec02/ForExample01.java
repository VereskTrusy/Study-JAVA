package study04.sec02;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		obj.method6();
	}

	private void method6() {
		
	}

	private void method5() {
		/*
		 * 1 ~ 10까지 홀수의 합 구하기
		 */
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수 조건
				sum += i;
			}
		}
		
//		for (int i = 2; i <= 10; i=i+2) { // 쌤 코드
//			if (i % 2 == 0) { // 짝수 조건
//				sum += i;
//			}
//		}
		System.out.println("1~10까지 짝수의 합은 : " + sum);		
	}

	private void method4() {
		/*
		 * 1 ~ 10까지 홀수의 합 구하기
		 */
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) { // 홀수 조건
				sum += i;
			}
		}
		System.out.println("1~10까지 홀 수의 합은 : " + sum);
	}

	private void method3() {
		/*
		 * 입력 받은 단으로 구구단 출력 해보기
		 */
		System.out.println("구구단 단수를 입력하세요 : ");
		int dan = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= 9; i++) {
			result = dan * i;
			System.out.println(dan + " x " + i + " = " + result);
		}
	}

	private void method2() {
		/*
		 * sum에 1~10 까지의 값을 더할것.
		 */
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}

	private void method1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("현재 i 값은 : " + i);
		}
	}
}
