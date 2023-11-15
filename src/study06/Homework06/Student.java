package study06.Homework06;


/*
	 문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.
	· String형의 학과와 정수형의 학번을 필드로 선언
	· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
 */
public class Student {
	
	String department;
	int StudentId;
	
	public static void main(String[] args) {
		Student s = new Student();
		s.department = "전자공학과";
		s.StudentId = 2023111401;
		
		System.out.println(s.department + " " + s.StudentId);
	}
}
