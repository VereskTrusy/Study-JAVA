package study06.sec04.test01;

public class MethodExample01 {
	public static void main(String[] args) {
		MethodExample01 obj = new MethodExample01();
		obj.method1("test1");
		obj.method1("test2");
		obj.method1("test3");
	}

	private void method1(String string) {
		System.out.println("외부에서 입력 한 값 : " + string);		
	}
}
