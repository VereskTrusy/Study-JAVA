package study03.homework2;

import java.util.Scanner;

public class Homework2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Homework2 obj = new Homework2();
        obj.process(); // 평년, 윤년 계산
    }

    private void process() {
        // 윤년인지 판단하기
        // 1. 4로 나눠지면 윤년
        // 2. 100으로 나눠지지만 400으론 안나눠지면 평년
        // 1997 X
        // 1996 O
        // 2000 O
        // 1900 X

        System.out.println("연도를 입력하세요 : ");
        System.out.print("");
        int year = sc.nextInt();

        // 작성 1차
//        boolean year400 = (((year % 400) == 0) ? true : false); /* true : 윤년 , false : 평년 */ System.out.println("400으로 나누어지는가? :" + year400);
//        boolean year100 = (((year % 100) == 0) ? true : false); /* true : 윤년 , false : 평년 */ System.out.println("100으로 나누어지는가? :" + year100);
//        boolean year4 = (((year % 4) == 0) ? true : false); /* true : 윤년 , false : 평년 */ System.out.println("4로 나누어지는가? :" + year4);
        
//      if (year400 == true && year100 == true) {
//      if (year4 == true) {
//          System.out.println("윤년입니다.");
//      } else {
//          System.out.println("평년입니다.");
//      }
//  } else if (year400 == false && year100 == true) {
//      System.out.println("평년입니다.");
//  } else {
//      if (year4 == true) {
//          System.out.println("윤년입니다.");
//      } else {
//          System.out.println("평년입니다.");
//      }
//  }
        
        // 첫번째 if
        // 100으로 나누어지고, 400으론 나누어지지 않음 = 평년
        // else 
        // 100으로 나누어지고, 400으론 나누어지거나 그외의 모든 조건
            // 두번째 if
            // 100으로 나누어지는 수는 4로도 나누어 질 수 있음 걍 여기서 판단 
        
        // 작성 2차 
        boolean year400 = year % 400 == 0;
        boolean year100 = year % 100 == 0;
        boolean year4 = year % 4 == 0;
        
        
        if (year100 == true && year400 == false) {
            System.out.println("평년입니다.");
        } else {
            if (year4 == true) {
                System.out.println("윤년입니다.");
            } else {
                System.out.println("평년입니다.");
            }
        }
        
        
        
        // chat gpt code : 망할놈 ㅈㄴ 똑띠하네...
//        if((year4 && !year100) || year400) {
//        	System.out.println("윤년");
//        }else {
//        	System.out.println("아님");
//        }
    }
}
