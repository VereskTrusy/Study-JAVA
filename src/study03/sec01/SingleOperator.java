package study03.sec01;

import java.util.Scanner;

public class SingleOperator {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SingleOperator obj = new SingleOperator();
        obj.method1();
        obj.method2();
    }

    private void method2() {
        // 증감연산자 ++ --
        int a = 10;
        int val = a++;
        System.out.println("a : " + a + " , val : " + val);

        val = ++a;
        System.out.println("a : " + a + " , val : " + val);

        val = a--;
        System.out.println("a : " + a + " , val : " + val);

        val = --a;
        System.out.println("a : " + a + " , val : " + val);

        // 증감연산자 말고 그냥 +1 식으로 계산해보기
    }

    private void method1() {
        // 부호 연산자 + -

        int a = 10;
        int b = -a;

        System.out.println(a + "  " + b);
    }
}
