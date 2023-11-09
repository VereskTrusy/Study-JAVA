package study02.sec02;

public class CastExample2 {
    public static void main(String[] args) {

//		// String  ->  int 변환
//		String val = "16";
//		
//		// Wrapper 클래스.parse기본타입이름(값);
//		int i1 = Integer.parseInt(val) + 4;
//		System.out.println(i1);
//		
//		// 문자 + 3 해보기
//		String s = val + 3;
//		System.out.println(s);
//		
//		
//		// String  ->  double 변환
//		String val2 = "16.321";
//		double d1 = Double.parseDouble(val2);
//		System.out.println(d1);

        // 주석처리 컨트롤 쉬프트 c

        /* 기본 타입 변수 선언하고 문자 값 넣어서 변환해볼것 */
        String strNum = "16";

        byte byteNum1 = Byte.parseByte(strNum); // byte 타입변환
        System.out.println("String > byte : " + byteNum1);

        short short1 = Short.parseShort(strNum); // short 타입변환
        System.out.println("String > short : " + short1);

        int intNum1 = Integer.parseInt(strNum); // int 타입변환
        System.out.println("String > int : " + intNum1);

        long longNum1 = Long.parseLong(strNum); // long 타입변환
        System.out.println("String > long : " + longNum1);

        float floatNum1 = Float.parseFloat(strNum); // float 타입변환
        System.out.println("String > float : " + floatNum1);

        double doubleNum1 = Double.parseDouble(strNum); // double 타입변환
        System.out.println("String > double : " + doubleNum1);

        String strBoolean = "true";
        boolean boolean1 = Boolean.parseBoolean(strBoolean); // boolean 타입변환
        System.out.println("String > boolean : " + boolean1);

        // 에러나는 부분 확인
        try {
            String errorStr = "hi";
            int intNum2 = Integer.parseInt(errorStr);
            System.out.println(intNum2);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // 예외발생다시의 호출스택에 있었던 메서드의 정보와 예외 메세지를 콘솔로 출력, getMessage와는 다르게 printStackTrace는
                                 // 리턴값이 없다. 이 메소드를 호출하면 메소드가 내부적으로 예외결과를 화면에 출력한다. printStackTrace는 가장 자세한 예외정보를
                                 // 제공한다.
            System.out.println("Exception ERROR : " + e.getMessage());
//			throw e;
        }
    }
}
