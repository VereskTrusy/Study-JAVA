package study06.sec02.test01;

public class FieldVarExample {

	static int a = 10;
	int b = 11;
	int c = 12;
	
	public static void main(String[] args) {
		System.out.println(a); // static 변수 콜 가능
		//System.out.println(b); // 일반 변수 콜 불가능
		
		FieldVarExample obj = new FieldVarExample();
		System.out.println(obj.b);
		obj.method1(); // 생성된 객체를 통해 메소드 호출
		method2(); // 스태틱 메소드는 객체 생성 없이 호출 가능
	}
	
	public static void method2() {
		System.out.println(a);
	}
	
	public void method1() {
		System.out.println(b);
	}

}
