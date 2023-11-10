package study05.sec02;

import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
		// obj.method1(); // 학생3명 과목 점수 저장 해보기
		// obj.method2(); // 2차원 배열 사용
		// obj.method3(); // 각각 출력 해보기
		obj.method4(); //
	}

	private void method4() {
		// 스캐너를 통해 학생점수 입력 받기
		int student = 3;
		int subjectSz = 3;
		int[][] scores = new int[student][subjectSz];
		int scoresSz = scores.length;
		String[] subject = new String[subjectSz];
		
		for(int i = 0; i < subjectSz; i++) {
			System.out.println("등록 할 과목 명을 입력 : ");
			subject[i] = sc.nextLine();
		}
		
		for(int i = 0; i < scoresSz; i++) {
			
		}
	}

	private void method3() {

		// 1번째 학생 영어
		// 2번째 학생 영어 수학점수
		// 3번째 학생 국어점수 각각 출력 해보기

		int[] sScore1 = { 30, 45, 60, 0 };
		int[] sScore2 = { 95, 85, 20, 0 };
		int[] sScore3 = { 25, 15, 10, 0 };

		int[][] scores = new int[3][4];
		scores[0] = sScore1;
		scores[1] = sScore2;
		scores[2] = sScore3;

		int s1e = scores[0][1]; // 영어점수
		int s2e = scores[1][1]; // 영어점수
		int s2m = scores[1][2]; // 수학점수
		int s3k = scores[2][0]; // 국어점수
		System.out.println(s1e);
		System.out.println(s2e);
		System.out.println(s2m);
		System.out.println(s3k);
	}

	private void method2() {
		int[] sScore1 = { 30, 45, 60, 0 };
		int[] sScore2 = { 95, 85, 20, 0 };
		int[] sScore3 = { 25, 15, 10, 0 };

		// 2차원 배열
		// int[][] : 타입
		// score : 변수
		// new : new연산자 객체 생성
		// int[3][3] : 배열 크기 초기화
		//
		// 0 1 2 열
		// 0번 라인 - [][][]
		// 1번 라인 - [][][]
		// 2번 라인 - [][][]

		int[][] scores = new int[3][4];
		scores[0] = sScore1;
		scores[1] = sScore2;
		scores[2] = sScore3;

		// 총점 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			scores[i][3] = sum;
		}

		// 출력하기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length - 1; j++) {
				System.out.println(scores[i][j] + "\t");
			}
			System.out.println("평균 : " + scores[i][3] / 3.0);
		}
	}

	private void method1() {
		/*
		 * 학생 3명의 국어 , 영어, 수학 점수 저장 해보기. 스캐너 사용 x
		 */
		int[] student1 = { 30, 45, 60 };
		int[] student2 = { 95, 85, 20 };
		int[] student3 = { 25, 15, 10 };
		String[] subject = { "국어", "영어", "수학" };
		double[] avrg = new double[3];
		int[] sum = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("학생1 " + subject[i] + " : " + student1[i] + "\t");
			System.out.print("학생2 " + subject[i] + " : " + student2[i] + "\t");
			System.out.print("학생3 " + subject[i] + " : " + student3[i] + "\n");
			sum[0] += student1[i];
			sum[1] += student2[i];
			sum[2] += student3[i];
		}
		for (int i = 0; i < 3; i++) {
			avrg[i] = sum[i] / 3.0;
			System.out.println("학생1 평균 : " + avrg[i]);
		}
	}
}
