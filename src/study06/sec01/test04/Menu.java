package study06.sec01.test04;

public class Menu {
	
	// Menu 클래스 생성
	// 0. 가게 이름
	// 1. 가격
	// 2. 이름
	
	Menu(){
		System.out.println();
	}
	
	/**
	 * 가게 이름
	 */
	String store = "화평본가"; // 처음부터 객체에 값을 할당 해놓으면 모든 Menu 객체가 만들어 질 때부터 값을 가진채로 생성된다.
	
	/**
	 * 가격
	 */
	int price;
	
	/**
	 * 이름
	 */
	String name;

	@Override
	public String toString() {
		return "Menu [storeName=" + store + ", price=" + price + ", name=" + name + "]";
	}
	
	
}
