package study06.sec01.test02;

public class ClassExample {
	// Book 이라는 클래스 만들어보고
	// Book 이라는 필드 값에
	// 각각
	// 가격, 이름, 저자 생성해보기
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.price = 5000;
		book1.name = "혼자공부하는 자바";
		book1.author = "외톨이";
		
		book2.price = 15000;
		book2.name = "Do it 자바";
		book2.author = "두잎이";
		
		book3.price = 30000;
		book3.name = "자바의 정석";
		book3.author = "정석이";
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
	}
	
	
}
