package time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date; // 자바 내에서 지원하는 기능

public class OldDateExample {

    public static void main(String[] args) {
        Date now = new Date(); // 자바 1.0 에서 지원하는 기능

        // 자바 8.0 이후에서 지원하는 기능
        LocalDate localDate = LocalDate.now(); // 현재 날짜
        LocalTime localTime = LocalTime.now(); // 현재 시간

        System.out.println("현재 날짜 :" + localDate);
        System.out.println("현재 시간 :" + localTime);

        // 2000년 5월13일이 무슨 요일일까?
        LocalDate birthday = LocalDate.of(2000,5,13);
        // 해당 날짜의 요일을 반환
        System.out.println("2000년 5월13일이 무슨 요일일까? :"+birthday.getDayOfWeek());

        // 오늘로 부터 100 이후 날짜는?
        LocalDate after100 = localDate.plusDays(100);

        System.out.println(" 오늘로 부터 100 이후 날짜는? : " + after100);


        // 나이 계산하기 (생일과 오늘 사이의 날짜를 계산)
        Period age = Period.between(birthday,localDate);
        // 나이를 연도 단위로 추출해 출려
        System.out.println("나이 : " + age.getYears() + "세");

        //Duration 시간 차이를 계산 할 때
        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(11,30);
        Duration duration = Duration.between(start,end);
        System.out.println("duration : " + duration.toMinutes() + "분");
    }
}
