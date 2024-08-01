package Edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EduDateTime {
    public static void main(String[] args) {
        // LocalDate Class

        // 현재날짜를 가져옴 YYYY-MM-DD
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        // 연도만 가져오고 싶을경우
        System.out.println(nowDate.getYear());
        // 달만 가져오고 싶을 경우
        System.out.println(nowDate.getMonth());
        // 달을 숫자로 가져오고싶을 경우
        System.out.println(nowDate.getMonthValue());
        // 날짜를 가져오고싶을 경우
        System.out.println(nowDate.getDayOfMonth());
        // 요일을 가져오고 싶을 경우
        System.out.println(nowDate.getDayOfWeek());
        // 요일을 숫자로 가져오고 싶을 경우
        System.out.println(nowDate.getDayOfWeek().getValue());
        // 해당 달의 마지막 날짜
        System.out.println(nowDate.lengthOfMonth());
        // 해당 연도의 날짜 수
        System.out.println(nowDate.lengthOfYear());

        // LocalTime

        // 현재 시,분,초 출력
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 현재 시
        System.out.println(nowTime.getHour());
        // 현재 분
        System.out.println(nowTime.getMinute());
        // 현재 초
        System.out.println(nowTime.getSecond());
        // 현재 밀리초
        System.out.println(nowTime.getNano());

        // LocalDateTime
        // 현재 연,월,일과 시간 출력
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        // 위의 메소드들 전부 사용가능
        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
        System.out.println(nowDateTime.getHour());
        System.out.println(nowDateTime.getMinute());
        System.out.println(nowDateTime.getSecond());
        System.out.println(nowDateTime.getNano());

        // 원하는대로 출력하기
        System.out.println(nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // 날짜 비교
        LocalDateTime nowDateTime2 = LocalDateTime.of(2024, 2, 24, 12, 00, 00);

        // until(비교할 날짜타입, 가져오고싶은 단위)
        long dateCompare = nowDateTime.until(nowDateTime2, ChronoUnit.DAYS);
        System.out.println(Math.abs(dateCompare));

        // 과거인지 미래인지 불린으로 체크 과거일경우 false로 나옴
        // isAfter을 사용하면 과거일 경우 true로 나옴
        boolean boo = nowDateTime.isBefore(nowDateTime2);
        boolean boo2 = nowDateTime.isAfter(nowDateTime2);
        // isEqual은 날짜가 같을 경우 true를 반환함
        boolean boo3 = nowDateTime.isEqual(nowDateTime2);

        System.out.println(boo);
        System.out.println(boo2);
        System.out.println(boo3);

        // 해당 달의 마지막 일
        LocalDateTime tmp = nowDateTime.withDayOfMonth(nowDateTime.getDayOfMonth());

        // 날짜를 한글로 출력
        String koreanDay = nowDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREA);
        System.out.println(koreanDay);
    }
}
