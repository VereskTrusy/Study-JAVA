package study06.sec04.test01;

public class MethodExample02 {

	public static void main(String[] args) {
		MethodExample02 obj = new MethodExample02();
		String result = obj.method1();
		System.out.println("method1에서 리탄 받은 값 : " + result);
		
		int result2 = obj.method2();
		System.out.println("method2에서 리턴 받은값 : " + result2);
	}

	private String method1() {
		return "test";
	}

	public int method2() {
		return 10;
	}
}
