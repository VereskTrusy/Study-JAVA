package study02.sec02;

public class ExamVer3 {

    int a = 10;

    // 메일 메서드
    public static void main(String[] args) {

        ExamVer3 ev = new ExamVer3();
        System.out.println("main 메소드에서 부른 a 값 " + ev.a); // 호출 가능

        int b = 7;
        System.out.println("main 메소드에서 부른 b 값 " + b);

        ev.test();
    }

    // 테스트 메서드
    public void test() {

        int b = 5;
        System.out.println("test 메소드에서 부른 a 값 " + a); // 호출 가능
        System.out.println("test 메소드에서 부른 b 값 " + b); // 호출 불가

        int c = 20;

        // if문 블럭
        if (true) {
            int d = 3;
            System.out.println("if 블럭에서 부른 a 값 " + a); // 호출 가능
            System.out.println("if 블럭에서 부른 d 값 " + d); // 호출 가능
            System.out.println("if 블럭에서 부른 c 값 " + c); // 호출 가능
        }

        System.out.println("test 메소드에서 부른 c 값 " + c); // 호출 가능
    }
}
