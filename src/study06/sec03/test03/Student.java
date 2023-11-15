package study06.sec03.test03;

public class Student {
	String nation;
	String group;
	String name;
	int age;
	
	
	public Student(String name, int age) {
//		this.nation = "한국";
//		this.group = "402호";
//		this.name = name;
//		this.age = age;
		
		// 모든 파라미터를 가진 생성자를 호출
		this("한국", "402호", name, age);
		System.out.println("2개의 파라미터를 가진 생성자 호출");
	}


	public Student(String group, String name, int age) {
		// 각각 개별로 설정
//		this.nation = "한국";
//		this.group = group;
//		this.name = name;
//		this.age = age;
		
		// 모든 파라미터를 가진 생성자를 호출
		this("한국", group, name, age);
		System.out.println("2개의 파라미터를 가진 생성자 호출");
	}


	public Student(String nation, String group, String name, int age) {
		this.nation = nation;
		this.group = group;
		this.name = name;
		this.age = age;

		System.out.println("4개의 파라미터를 가진 생성자 호출");
	}


	@Override
	public String toString() {
		return "Student [nation=" + nation + ", group=" + group + ", name=" + name + ", age=" + age + "]";
	}
}
