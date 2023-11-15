package study06.sec01.test03;

public class ClassExample03 {

	public static void main(String[] args) {
		// Pen 클래스 만들기
		// 색깔, 길이, 이름
		Pen pen1 = new Pen();
		Pen pen2 = new Pen();
		Pen pen3 = new Pen();
		
		pen1.setColor("블랙");
		pen1.setLength(15);
		pen1.setName("보드마카");
		
		pen2.setColor("노랑");
		pen2.setLength(14.5);
		pen2.setName("컴퓨터용싸인펜");
		
		pen3.setColor("초록");
		pen3.setLength(11.5);
		pen3.setName("유성매직");
		
		
		System.out.println(pen1);
		System.out.println(pen2);
		System.out.println(pen3);
		
	} // end main method
} // end ClassExample03 class
