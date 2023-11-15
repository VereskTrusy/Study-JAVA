package study06.sec01.test03;

public class Pen {
	// Pen 클래스 만들기
	// 색깔, 길이, 이름
	
	String color;
	double length;
	String name;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Pen [color=" + color + ", length=" + length + ", name=" + name + "]";
	}
	
	
}
