package study06.sec02.test01;

public class Student {
	// static 선언하여 만들어진 모든 객체는 해당 값을 참조한다.
	// 객체가 생성되지 않아도 존재한다.
	// 단 1개만 생성된다
	static String rm = "402호";
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
