package study06.sec02.test02;

public class FieldExample02 {
	public static void main(String[] args) {
		// Coumputer 객체 생성
		// name(static) = "컴퓨터";
		// cpu, ram, hdd
		
		Computer com = new Computer();
		System.out.println(com.name);
		System.out.println(com.hdd);
		System.out.println(com.ram);
		
		
	}
}
