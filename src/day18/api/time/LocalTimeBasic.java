package day18.api.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeBasic {
    public static void main(String[] args) {
        // 날짜 정보 제어
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        // 임의의 날짜 정보 생성
        LocalDate localDate = LocalDate.of(2022, 5, 4);
        System.out.println("localDate = " + localDate);
        // 시간정보 제어
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);
        LocalTime targetTime = LocalTime.of(20, 0, 3);
        System.out.println("targetTime = " + targetTime);
        //날짜와 시간 정보 제어
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("now1 = " + now1);
        // 현재 시간의 밀리초(유닉스 타임)
        // 1970-01-01 00:00:00 를 기준으로 현재까지 흘러간 시간(밀리초단위)
        long nowTimeMs = System.currentTimeMillis();
        System.out.println("nowTimeMs = " + nowTimeMs);
        // 각 날짜와 시간정보 추출
        int year = now1.getYear();
        System.out.println("year = " + year);
        int monthValue = now1.getMonthValue();
        System.out.println("monthValue = " + monthValue);
        DayOfWeek dayOfWeek = now1.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        String weekDay = "";
        switch (dayOfWeek){
            case MONDAY: weekDay = "월요일"; break;
            case TUESDAY: weekDay = "화요일"; break;
            case WEDNESDAY: weekDay = "수요일"; break;
            case THURSDAY: weekDay = "목요일"; break;
            case FRIDAY: weekDay = "금요일"; break;
            case SATURDAY: weekDay = "토요일"; break;
            case SUNDAY: weekDay = "일요일"; break;
        }


    }
}

