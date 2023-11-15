package study06.Homework06;

public class Tv {
	String manufacture;
	String dayOfManufacture;
	double hieght;
	double width;
	double depth;
	
	
	public Tv(String manufacture, String dayOfManufacture, double hieght, double width, double depth) {
		this.manufacture = manufacture;
		this.dayOfManufacture = dayOfManufacture;
		this.hieght = hieght;
		this.width = width;
		this.depth = depth;
	}

	
	@Override
	public String toString() {
		return "Tv [manufacture=" + manufacture + ", dayOfManufacture=" + dayOfManufacture + ", hieght=" + hieght
				+ ", width=" + width + ", depth=" + depth + "]";
	}


	public static void main(String[] args) {
		Tv tv = new Tv("삼성전자", "2023-11-14", 50, 45.5, 35.5);
		System.out.println(tv);
	}

}
