package study05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.method1(); // A ~ Z 까지 배열에 삽입하기
		obj.method2(); // 이름 배열에 삽입하기
		obj.method3(); // 이름 입력 받아서 배열에 저장
		obj.method4(); // 국, 영, 수 3과목의 점수 입력 받고 총점이 얼마인지 계산하기
	}

	private void method4() {
		/*
		 * 국, 영, 수 3과목의 점수 입력 받고 총점이 얼마인지 계산하시오.
		 */
		String[] subjectName = {"국어", "영어", "수학"};
		int subjectSize = subjectName.length;
		int[] score = new int[subjectSize];
		
		for(int i = 0; i < subjectSize; i++) {
			System.out.println(subjectName[i] + "의 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0.0;
		
		// 총점 구하기
		for(int i = 0; i < subjectSize; i++) {
			sum = sum + score[i];
		}
		
		// 평균 구하기
		avg = (double)(sum / subjectSize);
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
	}

	private void method3() {
		/*
		 * 배열 선언 후
		 * 이름 입력 받아서 배열에 저장
		 */
		
		String[] names = new String[2]; // 이름 저장 할 배열 선언
		int nameSize = names.length; // 배열 길이 획득
		
		for(int i = 0; i < nameSize; i++) {
			names[i] = sc.nextLine(); // 배열 크기 만큼 이름 입력 받기
		}
		
		for(int i = 0; i < nameSize; i++) { // 출력
			System.out.println(names[i]);
		}
	}

	private void method2() {
		/*
		 * 생성해봐라
		 * String[] name = new String[2];
		 * 
		 * name[0] = "홍길동";
		 * name[1] = "강감찬";
		 */
		
		String[] nameArr = {"홍길동", "강감찬"};
		int nameArrSize = nameArr.length;
		
		for(int i = 0; i < nameArrSize; i++) {
			System.out.println(nameArr[i]);
		}
	}

	private void method1() {
		/*
		 * 	char	: 배열타입
		 * 	[]		: 변수 앞이나 뒤에
		 * 	alpabet	: 변수명
		 * 	new		: 객체 생성
		 * 	char	: 배열 타입
		 * 	[26]	: 생성 숫자
		 */
		
		char[] array = new char[26];
		System.out.println("array.toString() : " + array.toString()); // 시작주소
		System.out.println("array.length : " + array.length); // 사이즈
		
		int arraySize = array.length;
		
		for(int i = 0; i < arraySize; i++) {
			array[i] = (char) (i + 65); // 알파벳 삽입
		}
		
		for(int i = 0; i < arraySize; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}
	}
}
