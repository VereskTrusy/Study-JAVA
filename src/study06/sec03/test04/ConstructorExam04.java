package study06.sec03.test04;

public class ConstructorExam04 {

	public static void main(String[] args) {
		Point p = new Point(1, 10);
		Rectangle r1 = new Rectangle(50, 30, 0, 0);
		Rectangle r2 = new Rectangle(50, 30, p);
		System.out.println(r1);
		System.out.println(r2);
		
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 10);
		Point p3 = new Point(10, 0);
		Triangle t1 = new Triangle(1, 3, 2, 2, 3, 1);
		Triangle t2 = new Triangle(p1, p2, p3);
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
