package study06.sec01.test01;

public class ClassExample {
	public static void main(String[] args) {
		Product prod1 = new Product(); // 각각의 객체이다 , new 연산자로 힙 영역의 새로운 메모리 할당
		prod1.prodname = "컴퓨터"; // 객체 멤버에 문자열 할당 해보기
		prod1.prodno = 101;
		
		Product prod2 = new Product();
		prod2.prodname = "TV";
		prod2.prodno = 102;
		
		Product prod3 = new Product();
		prod3.prodname = "스마트폰";
		prod3.prodno = 103;
		
		System.out.println(prod1); //  출력해보기
		System.out.println(prod2);
		System.out.println(prod3);
	}
}