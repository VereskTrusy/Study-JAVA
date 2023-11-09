package study04.sec01;

import java.util.Scanner;

public class IFExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		IFExample obj = new IFExample();
		obj.method1();
		obj.method2();
		obj.metho3();
		obj.metho4();
		obj.method5();
	}
	
	private void method5() {
		// 키보드로 점수를 입력 받아
		// A ~ F 학점 출력 받을 것.
		// A ~ F 학점 출력 받을 것. 0~2 : - , 3~6 : 0 , 7~9 : +
		
		System.out.println("확인 할 시험점수를 입력하세요 :");				
		int score = sc.nextInt(); // 사용자 입력
		String grade = "";
		
		// 입력받은 점수에 따라 학점 출력
		if(score > 89) {
			grade += "A";
			grade = scoreDetail2(grade, score);
		}
		else if(79 <= score) {
			grade += "B";
			grade = scoreDetail2(grade, score);
		}
		else if(69 <= score) {
			grade += "C";
			grade = scoreDetail2(grade, score);
		}
		else if(59 <= score) {
			grade += "D";
			grade = scoreDetail2(grade, score);
		}
		else {
			grade = "F";
		}
		
		System.out.println(grade);
	}
	
	
	private String scoreDetail2( String strgrade, int scr ) {
				
		if(scr == 100) {
			strgrade += "+";
		}
		else if(scr % 10 <= 2) {
			strgrade += "-";
		}
		else if(scr % 10 <= 6) {
			strgrade += "0";
		}
		else {
			strgrade += "+";
		}
		
		return strgrade;
	}
	
	

	private void metho4() {
		// 키보드로 점수를 입력 받아
		// A ~ F 학점 출력 받을 것.
		// A ~ F 학점 출력 받을 것. 0~2 : - , 3~6 : 0 , 7~9 : +
		
		System.out.println("확인 할 시험점수를 입력하세요 :");				
		int score = sc.nextInt(); // 사용자 입력
		
		// 입력받은 점수에 따라 학점 출력
		if(score > 89) {
			String strScore = "A";
			scoreDetail(strScore, score);
		}
		else if(79 <= score) {
			String strScore = "B";
			scoreDetail(strScore, score);
		}
		else if(69 <= score) {
			String strScore = "C";
			scoreDetail(strScore, score);
		}
		else if(59 <= score) {
			String strScore = "D";
			scoreDetail(strScore, score);
		}
		else {
			String strScore = "F";
			scoreDetail(strScore, score);
		}
	}
	
	
	private void scoreDetail( String strgrade, int scr ) {
		System.out.print(strgrade);
		
		if(scr == 100) {
			System.out.print("+");
		}
		else if(scr % 10 <= 2) {
			System.out.print("-");
		}
		else if(scr % 10 <= 6) {
			System.out.print("0");
		}
		else {
			System.out.print("+");
		}
		
		System.out.println("");
	}
	

	private void metho3() {
		/*
		 * 점수를 입력 받아 60점 이하면 불합격 메세지 출력.
		 */
		System.out.println("확인 할 시험점수를 입력하세요 :");
		int score = sc.nextInt();
		
		if( score <= 60 ) {
			System.out.println("불합격 입니다.");
		}
		else if( score == 100 ) {
			System.out.println("수석 합격 입니다.");
		}
		else {
			System.out.println("합격 입니다.");
		}
	}

	
	private void method2() {
		/*
		 * 점수를 입력 받아 60점 이하면 불합격 메세지 출력.
		 */
		System.out.println("확인 할 시험점수를 입력하세요 :");
		int score = sc.nextInt();
		
		if( score > 0 && score <= 60 && score <= 100 ) {
			System.out.println("불합격 입니다.");
		}
		else {
			System.out.println("합격 입니다.");
		}
	}

	
	private void method1() {
		/*
		 * 점수를 입력 받아 60점 이하면 불합격 메세지 출력.
		 */
		System.out.println("확인 할 시험점수를 입력하세요 :");
		int score = sc.nextInt();
		
		if( score > 0 && score <= 60 && score <= 100 ) {
			System.out.println("불합격 입니다.");
		}
		
	}	
}
