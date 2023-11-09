package study02.sec02;

public class ExamVar2 {

    public static void main(String[] args) {

        // 1년은 365.2422일이다 이것을 xx 일 xx 시간 xx 분 xx 초로 나타내라
        double days = 365.2422;

        int day = (int) days; // 365 일

        double hours = (days - day) * 24;

        System.out.println(hours + " 시간");

        int hour = (int) hours;

        System.out.println(hour + " 시간");

        double min = (hours - hour) * 60;

        System.out.println(min + " 분");

        int min_i = (int) min;
        System.out.println(min_i + " 분");

        double second = (min - min_i) * 60;
        System.out.println(second + " 초");

        int second_s = (int) second;

        System.out.println("1년은 " + days + "일 이다 이것은 " + day + " 일 " + min_i + " 분 " + second_s + " 초 이다");
    }

}
