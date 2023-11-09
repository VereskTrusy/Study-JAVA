package study02.sec02;

public class ValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNum = "125";
		
		int intNum = Integer.valueOf(strNum); // 다른 타입들도 valueOf 메소드로 변환가능
		System.out.println(intNum);
	}

}
