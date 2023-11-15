package study06.sec03.test05;

public class ConstructorExam05 {

	public static void main(String[] args) {
		// 회원가입
		// 클래스 생성 : Member
		// 클래스 데이터 : id, pass, name, age, mail
		
		Member m1 = new Member("idd", "java", "김홍례", 21, "hongye@naver.com");
		System.out.println(m1);
	}

}
