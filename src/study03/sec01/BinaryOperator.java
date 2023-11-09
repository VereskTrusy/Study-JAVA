package study03.sec01;

import java.util.Scanner;

public class BinaryOperator {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryOperator obj = new BinaryOperator();
        obj.artimeticOper(); // 짝수 홀수 판별
        obj.realationOper(); // 작고 크고 판별
        obj.realationOper2();
    }

    private void realationOper() {
        // > < == >= <= !=

        System.out.println("숫자를 입력하세요 : ");
        int inputNum = sc.nextInt();

        int b = 5;
        if (inputNum > b) {
            System.out.printf("입력한 값이 %d보다 큽니다 \n", b);
        }
        if (inputNum < b) {
            System.out.printf("입력한 값이 %d보다 작습니다 \n", b);
        }
        if (inputNum == b) {
            System.out.printf("입력한 값이 %d보다 같습니다 \n", b);
        }
        if (inputNum >= b) {
            System.out.printf("입력한 값이 %d보다 같거나 큽니다 \n", b);
        }
        if (inputNum <= b) {
            System.out.printf("입력한 값이 %d보다 같거나 작습니다 \n", b);
        }
        if (inputNum != b) {
            System.out.printf("입력한 값이 %d보다 같지 않습니다 \n", b);
        }
    }

    private void realationOper2() {
        // &&, ||, !

        boolean a = true;
        boolean b = true;

        if (a && b) {
            System.out.println("둘 다 참 입니다.");
        }
    }

    private void artimeticOper() {
        // 산술 연산 + - / * %

        int a = 7;
        int b = 3;
        System.out.println("a + b \t" + (a + b));
        System.out.println("a - b \t" + (a - b));
        System.out.println("a * b \t" + (a * b));
        System.out.println("a / b \t" + (a / b));
        System.out.println("a % b \t" + (a % b));

        System.out.println("숫자를 입력하세요 : ");
        int inputNum = sc.nextInt();

        if (inputNum % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
