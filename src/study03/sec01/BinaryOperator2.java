package study03.sec01;

import java.util.Scanner;

public class BinaryOperator2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryOperator2 obj = new BinaryOperator2();
        // obj.bitOperator();
        obj.bitOperator2();
    }

    private void bitOperator2() {
        // 비트 쉬프트 연산자
        int a = 8;

        System.out.println(a >> 2);
        System.out.println(a << 2);
    }

    public void bitOperator() {
        /*
         * 논리 산술 연산자
         */

        int a = 45;
        int b = 25;
        System.out.println(a + " & " + b + " = " + (a + b));
        System.out.println(a + " | " + b + " = " + (a | b));
        System.out.println(a + " ^ " + b + " = " + (a ^ b));
    }
}
