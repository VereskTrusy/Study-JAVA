package study06.sec03.test04;

public class Rectangle {
	// 사각형의 높이, 너비, 중심점x, 중심점y -> 생성자로 만들것
	// 넓이
	
	
	int heigth;
	int width;
	int x;
	int y;
	int area;
	
	public Rectangle(int hieght, int width, Point p) {
		this(hieght, width, p.x, p.y);
	}
	
	
	public Rectangle(int heigth, int width, int x, int y) {
		super();
		this.heigth = heigth;
		this.width = width;
		this.x = x;
		this.y = y;
		this.area = this.heigth * this.width;
	}


	@Override
	public String toString() {
		return "Rectangle [heigth=" + heigth + ", width=" + width + ", x=" + x + ", y=" + y + ", area=" + area + "]";
	}
}
