package study06.sec04.test03;

public class Circle {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		Circle c = new Circle();
		System.out.println(c.round(14));
		System.out.println(c.area(14));
	}

	// 원의 둘레를 구하는 메소드 작성
	// 2 * PI * 반지름
	public double round(int radius) {
		return 2 * Math.PI * radius;
	}
	
	
	// 원의 넓이 구하는 메소드 작성
	// PI * 반지름 * 반지름
	public double area(int radius) {
		return Math.PI * radius * radius;
	}
}
