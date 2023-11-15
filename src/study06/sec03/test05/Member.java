package study06.sec03.test05;

public class Member {
	
	String id;
	String pass;
	String name;
	int age;
	String mail;
	
	public Member() {
		
	}
	
	public Member(String id, String pass, String name, int age, String mail) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.mail = mail;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", mail=" + mail + "]";
	}
	
	
}
