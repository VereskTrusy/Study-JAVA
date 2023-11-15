package study06.sec01.test02;

/**
 * 책 클래스
 * @author PC-25
 *
 */
public class Book {
	
	/**
	 * 가격
	 */
	int price;
	
	/**
	 * 책이름
	 */
	String name;
	
	/**
	 * 저자
	 */
	String author;

	@Override
	public String toString() {
		return "책 : [price=" + price + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
