package study04.sec02;

import java.util.Scanner;

public class WhileExample01 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		WhileExample01 obj = new WhileExample01();
		obj.method1();
		obj.method2();
		obj.method3();
	}
	
	
	/**
	 * while 문으로 프로그램 계속 동작 시키기
	 */
	private void method3() {
		System.out.println("프로그램이 실행중...");
		
		while(true) {
			String inputStr = sc.nextLine();
			
			if(inputStr.equals("exit")) { // 종료 문자 , String은 기본타입이 아니라 equals를 사용한다.
				System.out.println("프로그램 종료");
				break;
			}
		}
	}


	/**
	 *  오버플로우 경험 해보기
	 */
	private void method2() {
		int i = 1;
		
		while( i > 0 ) {
			i = i + 10000;
			System.out.println(i);
		}
	}
	
	
	



	/**
	 *  while 문 사용해보기
	 */
	private void method1() {
		int i=0;
		while( i < 10 ) {
			System.out.println(" 실행 중 ... ");
			i++;
		}
	}
}
