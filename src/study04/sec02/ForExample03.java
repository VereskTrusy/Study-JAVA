package study04.sec02;

import java.util.Scanner;

public class ForExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample03 obj = new ForExample03();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		obj.method6();
	}

	/**
	 *  숫자를 입력 받고 해당 숫자까지의 곱을 구해보기
	 *  
	 *  ex) 5 > 1 * 2 * 3 * 4 * 5
	 */
	private void method6() {
		
		int inputInt = sc.nextInt();
		long result = 1; // 0 x 1 = 0 이기 때문에 시작을 1로 설정
		
		for(int i = 1; i <= inputInt; i++) {
			result = result * i;
		}
		// 출력
		System.out.println("팩토리얼 : " + result);
		
	}

	/*
	 *   소문자 문자열을 입력받고 모음을 제거하기
	 *   apple > ppl
	 *   
	 *   a e i o u
	 */
	private void method5() {
		String inputStr = sc.nextLine(); // 문자열 입력받기
		int inputStrSize = inputStr.length(); // 입력받은 문자열 길이
		String result = ""; // 결과 출력
		char c = 0;
		
		for( int i = 0; i < inputStrSize; i++) {
			
			c = inputStr.charAt(i); // 문자열의 한 문자만 획득
			
			if( !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ) { // 모음이 아닌것만 저장
				result = result + c;
			}
		}
		// 출력
		System.out.println(result);
	}

	/*
	 *   스캐너를 통해 숫자를 입력 받고
	 *   홀수라면 1부터 해당 숫자까지 홀수의 합
	 *   짝수라면 2부터 해당 숫자까지 짝수의 합
	 *   
	 *   ex) 입력 : 9(홀수), 출력 : 1~9 까지 홀수의합
	 */
	private void method4() {
		
		int inputNum = 0;
		inputNum = sc.nextInt(); // 숫자 입력 받기
		boolean even = (inputNum % 2 == 0) ? true : false; // 짝수 홀수 판별
		int sum = 0; // 합 저장
		int startNum =0; // 짝수 2, 홀수 1 로 더할 값의 시작 숫자 지정
		String evenOdd = ""; // 짝수, 홀수 문구 세팅
		
		// 짝수 일 때 2부터 합산
		if(even) { // 짝수
			startNum = 2;
			evenOdd = "짝수";
		}
		else { // 홀수 일 때 1부터 합산 
			startNum = 1;
			evenOdd = "홀수";
		}
		
		for( int i = startNum; i <= inputNum; i+=2) { // 2씩 증가하며 합산하기
			if(even) { // 짝수
				sum += i;
			}
			else { // 홀수
				sum += i;
			}
		}
		// 출력
		System.out.println(evenOdd + " 입니다. 해당 숫자까지의 " + evenOdd + " 합은 : " + sum + " 입니다.");
		
	}

	/*
	 *   입력받은 문자를 소 > 대, 대 > 소문자로 변경하기
	 */
	private void method3() {
		
		System.out.println("입력 : ");
		String inputSrt = sc.nextLine();
		int inputStrSize = inputSrt.length();
		char inputChar=0;
		
		for(int i=0; i<inputStrSize; i++) {
			inputChar = inputSrt.charAt(i); // 입력받은 문자열을 한문자씩 획득
			
			if('a' <= inputChar && inputChar <= 'z') { // 소문자 > 대문자
				inputChar = (char) (inputChar - 32);
				System.out.print(inputChar);
			}
			else if('A' <= inputChar && inputChar <= 'Z') { // 대문자 > 소문자
				inputChar = (char) (inputChar + 32);
				System.out.print(inputChar);
			}
			else { // 그외는 그대로 출력
				System.out.print(inputChar);
			}
		}
	}

	private void method2() {
		/*
		 *  a -> A 변환
		 *  A -> a 변환
		 */
		//System.out.println((int)'a' + " " + (int)'A');
		//System.out.println((int)'a'-'A');
		
		
		char c = sc.nextLine().charAt(0);
		
		
		if('a' <= c && c <= 'z') {
			c = (char) (c - 32);
			System.out.println(c);
		}
		if('A' <= c && c <= 'Z') {
			c = (char) (c + 32);
			System.out.println(c);
		}
	}

	private void method1() {
		/*
		 *   a-z까지 출력해주는 프로그램 만들기
		 */
//		char alpa = 'a';
//		int i = alpa + 2;
//		char alpa2 = (char) i;
//		System.out.println(alpa2);
		
		
		char alpa = 'a';
		
//		for(int i=0; i<26; i++) {
//			System.out.println((char)(alpa + i));
//		}
		
		for(int c='a'; c<'z'; c++) {
			System.out.print((char) c + "\t");
		}
	}
}
