package study05.Homework5;

import java.util.Arrays;
import java.util.Scanner;

import study05.sec02.ArrayExample06;

public class Homework7 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework7 obj = new Homework7();
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

		String[] subject = {"국어", "영어", "수학", "총점", "평균", "석차"};
		String[] name = {"미연", "민니", "소연", "우기", "슈화"};
		
		// [국어][영어][수학][총점][평균][석차]
		int[][] scores = {{10, 20, 30, 0, 0, 0},
						  {15, 25, 35, 0, 0, 0},
						  {20, 30, 40, 0, 0, 0},
						  {30, 40, 50, 0, 0, 0},
						  {25, 35, 45, 0, 0, 0}};
		int scoresSz = scores.length;
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
		// 등수 구하기 - 총점 높은 순서대로
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores.length-1; j++) {
				if(scores[j][3] < scores[j+1][3]) {
					int[] temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
					
					String strTemp = name[j];
					name[j] = name[j+1];
					name[j+1] = strTemp;
				}
			}
		}
		// 등수 매기기 
		for(int i = 0; i < scores.length; i++) {
			scores[i][5] = i+1;
		}
		// 등수 구하기 - 선생님
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores.length; j++) {
//				if(scores[i][3] > scores[j][3]) scores[i][5]++; 
//			}
//		}
		System.out.println("                     [성적표]");
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
