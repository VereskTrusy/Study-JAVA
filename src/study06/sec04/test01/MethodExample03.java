package study06.sec04.test01;

public class MethodExample03 {

	public static void main(String[] args) {
		MethodExample03 obj = new MethodExample03();
		int add = obj.add(10, 3);
		System.out.println(add);
		
		int minus = obj.minus(10, 3);
		System.out.println(minus);
		
		int gop = obj.gop(10, 3);
		System.out.println(gop);
		
		double nanu = obj.nanu(10, 3);
		System.out.println(nanu);
	}

	private double nanu(int i, int j) {
		return (double)i/j;
	}

	private int gop(int i, int j) {
		return i*j;
	}

	private int minus(int i, int j) {
		return i-j;
	}

	private int add(int i, int j) {
		return i+j;
	}
	
	

}
