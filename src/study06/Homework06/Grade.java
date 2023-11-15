package study06.Homework06;


/*
	세 과목의 성적을 입력 받고 총점과 합을 출력할 수 있는 Grade class를 설계하시오.
 */
public class Grade {
	String subName1;
	double subScore1;
	
	String subName2;
	double subScore2;
	
	String subName3;
	double subScore3;
	
	// 생성자
	public Grade(String subName1, double subScore1, String subName2, double subScore2, String subName3, double subScore3) {
		this.subName1 = subName1;
		this.subScore1 = subScore1;
		this.subName2 = subName2;
		this.subScore2 = subScore2;
		this.subName3 = subName3;
		this.subScore3 = subScore3;
		
		// 입력 완료 후엔 총점과 평균 출력
		display(subScore1, subScore2, subScore3);
	}
	
	// 프린트
	public void display(double subScore1, double subScore2, double subScore3) {
		int sum = total(subScore1, subScore2, subScore3);
		System.out.println("세 과목의 총점 : " + sum);
		double avg = average(subScore1, subScore2, subScore3);
		System.out.println("평균 : " + avg);
	}
	
	// 총점
	public int total(double subScore1, double subScore2, double subScore3) {
		return (int)(subScore1 + subScore2 + subScore3);
	}
	
	// 평균
	public double average(double subScore1, double subScore2, double subScore3) {
		return total(subScore1, subScore2, subScore3) / 3;
	}
}
