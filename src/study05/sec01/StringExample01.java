package study05.sec01;

import java.util.Scanner;

import org.omg.CORBA.Object;

public class StringExample01 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StringExample01 obj = new StringExample01();
		obj.method1();
	}
	
	private void method1() {
		String str1 = "홍길동"; // str1과 str2는 힙 메모리의 동일한 객체를 참조한다
		String str2 = "홍길동"; 
		String str3 = "엄홍길";
		String str4 = new String("홍길동"); // str4는 새로운 객체를 참조한다
		
		String str5 = str4.intern(); // intern  호출하여 사용해보기
		
		// 객체 주소값 확인해보기
		// 결과와 같이 str1 과 str2 는 같은 주소를 가진다 
		System.out.println("str1 : " + System.identityHashCode(str1)); // 1418428263
		System.out.println("str2 : " + System.identityHashCode(str2)); // 1418428263
		System.out.println("str4 : " + System.identityHashCode(str4)); // 2059904228
		System.out.println("str5 : " + System.identityHashCode(str5)); // 1418428263
		// intern() 메소드는 string constant pool 을 뒤진다는데 그게 맞나보다. str1과 같은 주소를 반환 했다
		
		// 같은지 다른지 확인 해보기
		// ==, != 은 기본적으로 주소값을 비교한다.
		// 따라서 str1 과 str4는 다른 주소 값이므로 false가 출력된다
		System.out.println(str1 == str2); // true
		System.out.println(str2 == str3); // false
		System.out.println(str1 == str4); // false 
		System.out.println(str1 == str5); // true
		System.out.println(str4 == str5); // false
		// String.eqauls 를 통한 값 대조
		System.out.println(str1.equals(str4)); // true , 각기 다른 객체를 참조 하므로 같지 않다
		
	}
}
