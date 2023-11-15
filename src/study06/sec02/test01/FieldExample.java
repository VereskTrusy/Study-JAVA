package study06.sec02.test01;

public class FieldExample {
	public static void main(String[] args) {
		System.out.println(Student.rm); // 객체 생성 전 출력 해보기
		
		Student s1 = new Student();
		s1.name = "황지훈";
		s1.age = 20;
		
		Student s2 = new Student();
		s2.name = "박건태";
		s2.age = 21;
		
		// static 변수값 변경해보기
		s1.rm = "401호";
		
		System.out.println(s1.rm + ", " + s1);
		System.out.println(s2.rm + ", " + s2);
	}
}
