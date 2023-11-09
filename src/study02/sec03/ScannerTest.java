package study02.sec03;

import java.util.Scanner;

public class ScannerTest {

    /*
     * 키보드 입력받기 위한 객체 생성 키보드 입력받기, 문자로된 키만 입력되네? 다른 키는 안먹힘, 클래스내에서 모든 사용 가능케 main ->
     * class 영역으로 이동
     */
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ScannerTest obj = new ScannerTest();
        obj.scanningKeyboard(); // 작성한 메소드 호출
        obj.printfExam();
        obj.userInfo();
        obj.scoreCal();
    }

    private void scanningKeyboard() {
        /*
         * 사용자 메소드 사용 해보기 메소드는 main문 밖에서 작성한다. 메소드 안에서 메소드를 만들지 않는다
         */
        System.out.println("입력가능한 문자를 스캐닝 중 입니다.");
        System.out.println("문자를 입력하세요 : ");
        String scanStr = sc.nextLine(); // 다음줄 이동
        System.out.println("입력된 문자열 : " + scanStr); // 입력 후 엔터치면 스캐닝 종료됨
    }

    private void printfExam() {
        System.out.print("System.out.print( ) 를 사용합니다. ");
        System.out.print("줄바꿈 기능이 없습니다.");
        System.out.println();

        /*
         * 형식지정 문자열 %[[-|0]n]d : 10진 정수 - : 왼쪽정렬 0 : 남은 빈 공간에 0을 채움
         */
        System.out.printf("나이 : %d \n", 20); // 숫자 형식 지정
        System.out.printf("나이 : %8d \n", 20); // 숫자 형식 지정, 앞에 공백 8칸 채움
        System.out.printf("나이 : %-8d \n", 20); // 총 8칸 중에 숫자를 왼쪽으로 정렬함
        System.out.printf("나이 : %08d \n", 20); // 총 8칸 중에 숫자0으로 빈공간을 채움
        System.out.println();

        /*
         * 형식지정 문자열 %[[-|0]n].pf : 실수 n : 전체자리수 p : 소수점이하의 자리수
         */
        System.out.printf("키 : %8.2f \n", 170.1);
        System.out.printf("키 : %-8.2f \n", 170.1);
        System.out.printf("키 : %08.2f \n", 170.1);
        System.out.println();

        /*
         * 형식지정 문자열 %[[-|0]n]s : 문자열
         * 
         */
        System.out.printf("이름 : %s \n", "장득춘");
        System.out.printf("이름 : %8s \n", "장득춘");
        System.out.printf("이름 : %-8s \n", "장득춘");
    }

    private void userInfo() {
        /*
         * 이름 나이 키 입력 받아서 출력 해보기
         */
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.print("키를 입력 하세요 : ");
        int key = sc.nextInt();

        System.out.println("입력하신 정보는 다음과 같습니다.");
        System.out.printf("%-4s %8s\n", "이름 :", name);
        System.out.printf("%-4s %8s\n", "나이 :", age);
        System.out.printf("%4s %8s\n", "키   :", key);

    }

    private void scoreCal() {
        /*
         * 국어, 영어, 수학 점수 입력 받고 각 점수 출력 후 총점, 평균 출력
         */
        int kor;
        int eng;
        int math;

        System.out.println("과목 점수를 입력하시면 총점과 평균을 계산 해드립니다.");
        System.out.print("국어 : ");
        kor = sc.nextInt();

        System.out.print("영어 : ");
        eng = sc.nextInt();

        System.out.print("수학 : ");
        math = sc.nextInt();

        System.out.println("총점과 평균을 계산 중 입니다...");

        int sum = kor + eng + math;
        double evr = (double) sum / 3.0;

        System.out.printf("총점은 %d 입니다.\n", sum);
        System.out.printf("평균은 %.2f 입니다.\n", evr);
    }
}

/*
 * 이클립스 단축키 F2 : 누르면 인텔리제이에 알트 + 엔터 랑 같음
 * 
 * 
 * 
 * 
 * 
 * 
 */