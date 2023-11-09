package study03.sec01;

import java.util.Scanner;

public class TernaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TernaryOperator obj = new TernaryOperator();
		obj.method1();
		obj.method2();
	}

	private void method2() {
		// 3항 연산자 , 연산도 입력 가능
		int inputNum = sc.nextInt();
		int result = (inputNum < 10 ? (3 + 4) : (4 + 5));
		System.out.println(result);
	}

	private void method1() {
		// 3항 연산자

		boolean bool = (1 == 1 ? true : false);
		System.out.println(bool);

		System.out.println("나이를 입력하세요 : ");
		System.out.print("");
		int age = sc.nextInt();
		String result = (age >= 18 ? "성인	" : "미성년자");
		System.out.println(result);
	}
}
