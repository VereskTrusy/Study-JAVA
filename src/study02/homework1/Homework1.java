package study02.homework1;

import java.util.Date;

public class Homework1 {
    public static void main(String[] args) {

        /*
         * date 란 객체는 1970년 기준 시간으로 부터 지난 시간을 가져옵니다. 오늘 날짜는 1970년 기준 시간을 기준으로 현재
         * 
         * 몇년 몇월 몇일이... 몇초가 지났는지 출력해보세요.
         */
        Date date = new Date(); // Date 객체 생성

        long time = date.getTime() / 1000; /* 1698899309406 (세컨드 단위) */

        // 단위 정의
        int sec = 1;
        int min = sec * 60; // 60초
        int hour = min * 60; // 3600초
        int day = hour * 24; // 86400초
        int year = day * 365; // 31536000초

        int years = (int) time / year; // 53 년
        int minusYears = (int) time % year; // 몫 연도 뺀 시간

        int days = minusYears / day; // 318 일
        int minusDays = minusYears % day; // 몫 : 연도, 일 뺀 시간

        int hours = minusDays / hour; // 11 시간
        int minusHours = minusDays % hour; // 몫 : 연도, 일, 시간 뺀 시간

        int mins = minusHours / min; // 24분
        int secs = minusHours % min; // 27초 (나머지는 어차피 초단위니까 초만 남음)

        System.out.println("" + years + " 년 " + days + " 일 " + hours + " 시간 " + mins + " 분 " + secs + " 초 ");

        // 선생님 : 총시간 - (연도 * 연시간) - (일수 * 일시간) - (시간 * 60 * 60) - (분 * 60) 이런식으로 계산함

    }

}
