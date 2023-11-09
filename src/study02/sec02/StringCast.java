package study02.sec02;

public class StringCast {

    public static void main(String[] args) {

        String name = "장덕배";
        int age = 36;

        String job = "프로그래머";
        double ki = 170.1;

        String result = name + " " + age + " " + job + " " + ki; // 스트링 + 연산시 자동으로 문자열로 변환

        System.out.println(result);
    }

}
