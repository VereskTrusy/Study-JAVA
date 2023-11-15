package study06.sec03.test01;

public class Book {

	String name;
	int price;
	String author;
	
	// 기본 생성자 정의
	Book(){
		
	}
	
	// 생성자 정의
	Book(String name, int price, String author){
		this.name = name;
		this.price = price;
		this.author = author;
	}

	/**
	 * 출력 메소드
	 */
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
}
