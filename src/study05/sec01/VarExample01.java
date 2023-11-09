package study05.sec01;

public class VarExample01 {
	int a = 10;
	static int b = 11;
	
	public static void main(String[] args) {
		System.out.println(b);
		
		int c = 12;
		System.out.println(c);
		
		VarExample01 ve = new VarExample01();
		System.out.println(c);
		
		ve.method1();
	}
	
	public void method1() {
		int d = 13;
		if(true) {
			int e = 14;
			for(int i = 0; i < 10; i++) {
				System.out.println();
			}
		}
	}
}
/*
 * 디버깅 모드 사용해보기
 * 
*/
