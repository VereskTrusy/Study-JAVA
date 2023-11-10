package study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample06 obj = new ArrayExample06();
		obj.method1();
	}

	private void method1() {
		// 5명의 국어 영어 수학 점수를
		// 2차원 배열을 이용하여 선언 및 값을 저장 하세요
		// 스캐너 x
		// score : 2차원 배열 이름
		// 
		//
		// 5명의 이름을 저장한 배열 선언
		// name : 배열이름

		String[] subject = {"국어", "영어", "수학"};
		String[] name = {"미연", "민니", "소연", "우기", "슈화"};
		
		// [국어][영어][수학][총점][평균][등수]
		int[][] scores = {{10, 20, 30, 0, 0, 0},
						  {15, 25, 35, 0, 0, 0},
						  {20, 30, 40, 0, 0, 0},
						  {30, 40, 50, 0, 0, 0},
						  {25, 35, 45, 0, 0, 0}};
		
		// 총점 
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < subject.length; j++) {
				scores[i][3] += scores[i][j];
			}
		}
		
		// 평균 
		for(int i = 0; i < scores.length; i++) {
			scores[i][4] = (int)(scores[i][3] / subject.length);
		}
		
		int num = 1;
		// 등수 구하기
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores.length-1; j++) {
				if(scores[j][3] < scores[j+1][3]) {
					int[] temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < scores.length; i++) {
			scores[i][5] = i+1;
		}
		// 등수 구하기 - 선생님
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores.length; j++) {
//				if(scores[i][3] > scores[j][3]) scores[i][5]++; 
//			}
//		}
		for(int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));			
		}
	}
}
