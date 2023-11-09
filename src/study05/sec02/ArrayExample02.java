package study05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
		obj.method1(); // 버블 정렬 이해하기
		obj.method2(); // 선택 정렬 이해하기
		obj.method3(); // 버블 정렬로 점수 정렬하기
		obj.lotto(); // 로또번호 생성 및 정렬
		obj.method4(); // 잔돈 반환
	}

	private void method4() {
		/*
		 * 잔돈 반환 프로그램
		 * 
		 * 10만 500원
		 * 
		 * 10000원 10개 500원 1개
		 */
		int[] coin = {50000, 10000, 5000, 1000, 500, 100, 10};
		int[] coinCount = new int[6];
		int amt = sc.nextInt();
		
		for(int i = 0; i < coin.length; i++) {
			if(amt % coin[i] != 0) {
				amt = amt % coin[i];
				coinCount[i] = amt / coin[i];
			}
		}
		
		for(int i = 0; i < coin.length; i++) {
			if(coinCount[i] != 0) {
				System.out.println(coin[i] + "원 ");
				System.out.println(coinCount[i] + "개 ");
			}
		}
	}

	private void lotto() {
		/*
		 * 로또번호 생성 및 정렬
		 */
		int[] num = new int[6]; // 로또번호 저장 할 배열 선언
		int numSize = num.length;
		
		// lotto 번호 생성
		for(int i = 0; i < numSize; i++) {
			int randomNum = new Random().nextInt(44) + 1;
			num[i] = randomNum; // 랜덤 숫자 삽입
			for(int j = 0; j < i; j++) {
				if(num[j] == randomNum) {
					i--;
					break;
				}
			}
		}
		
		// lotto 번호 정렬
		// 버블 정렬 사용
		for(int i = 0; i < numSize; i++) {
			for(int j = 0; j < numSize-1; j++) {
				if(num[j] > num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		// 출력
		System.out.print("행운의 로또 번호 : ");
		for(int i = 0; i < numSize; i++) {
			System.out.print(num[i] + " ");
		}
	}

	private void method3() {
		String[] name = {"홍길동", "이순신", "강감찬", "이성계", "세종"};
		int[] score = {30, 85, 70, 95, 55};
		int scoreSize = score.length;

		// 정렬 전 출력
		System.out.println("버블 정렬 전 출력");
		for(int i = 0; i < scoreSize; i++) {
			System.out.print(name[i] + " : ");
			System.out.println(score[i]);
		}
		System.out.println("");
		
		// 버블 정렬 사용
		for(int i = 0; i < scoreSize; i++) {
			for(int j = 0; j < scoreSize-1; j++) {
				if(score[j] > score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					
					String tempName = name[j];
					name[j] = name[j+1];
					name[j+1] = tempName;
				}
			}
		}
		
		
		System.out.println("버블 정렬 후 출력");
		for(int i = 0; i < scoreSize; i++) {
			System.out.print(name[i] + " : ");
			System.out.println(score[i]);
		}
	}

	private void method2() {
		/*
		 * 선택 정렬
		 */
		int[] numArr = {30, 85, 70, 95, 55};
		int numArrSize = numArr.length;
		
		// 정렬 전 배열 출력
		for(int i = 0; i < numArrSize; i++) {
			System.out.print(numArr[i] + " ");
		}
		
		// 선택 정렬
		for(int i = 0; i < numArrSize-1; i++) {
			for(int j = i+1; j < numArrSize; j++) {
				if(numArr[i] > numArr[j]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		// 정렬 된 배열 출력
		System.out.println("");
		for(int i = 0; i < numArrSize; i++) {
			System.out.print(numArr[i] + " ");
		}
		
	}

	private void method1() {
		/*
		 * 버블 정렬
		 * 30, 85, 70, 95, 55 값을 배열에 저장 해보기.
		 */
		
		int[] numArr = {30, 85, 70, 95, 55};
		int numArrSize = numArr.length;
		
		// 정렬 전 배열 출력
		for(int i = 0; i < numArrSize; i++) {
			System.out.print(numArr[i] + " ");
		}
		
		// 버블 정렬
		for(int i = 0; i < numArrSize; i++) {
			for(int j = 0; j < numArrSize-1; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		
		// 정렬 된 배열 출력
		System.out.println("");
		for(int i = 0; i < numArrSize; i++) {
			System.out.print(numArr[i] + " ");
		}
	}
	
} // end class
