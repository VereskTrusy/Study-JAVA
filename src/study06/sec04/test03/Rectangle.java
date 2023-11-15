package study06.sec04.test03;

public class Rectangle {

	public static void main(String[] args) {
		// 사각형 넓이를 구하는 메소드 만들어 보기
		// 파라미터 높이, 너비
		
		Rectangle r = new Rectangle();
		System.out.println(r.area(10, 5));
	}
	
	
	public int area(int h, int w) {
		return h * w;
	}

}
