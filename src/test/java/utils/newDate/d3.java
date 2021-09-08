package utils.newDate;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.List;

import utils.utils;

public class d3 {


    /**
     * Duration 以秒和纳秒为单位对数量或时间进行建模。 可以使用其他基于持续时间的单位（例如分钟和小时）访问它
     */
    @Test
    public void d1() {
        LocalTime time1 = LocalTime.of(13, 45, 20);
        LocalTime time2 = LocalTime.of(13, 50, 30);

        LocalDateTime dateTime1 = LocalDateTime.of(2021, 9, 8, 13, 45, 20);
        LocalDateTime dateTime2 = LocalDateTime.of(2021, 9, 15, 13, 45, 20);

        Instant instant1 = Instant.ofEpochSecond(200);
        Instant instant2 = Instant.ofEpochSecond(300);

        Duration d1 = Duration.between(time1, time2);
        Duration d2 = Duration.between(dateTime1, dateTime2);
        Duration d3 = Duration.between(instant1, instant2);

        utils.toPrintln(List.of("d1", "d2", "d3"), d1, d2, d3);
    }


    /**
     * Period 以年、月和日为单位对数量或时间进行建模
     */
    @Test
    public void d2() {
        Period period = Period.between(LocalDate.of(2017, 9, 11),
                LocalDate.of(2021, 9, 8));

        System.out.println(period);
    }


    /**
     * 创建 Duration 和 Period 对象
     */
    @Test
    public void d3() {
        Duration threeMinute = Duration.ofMinutes(3);
        Duration threeMinutes = Duration.of(3, ChronoUnit.MINUTES);
        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);

        utils.toPrintln(List.of("threeMinute", "threeMinutes", "tenDays", "threeWeeks", "twoYearsSixMonthsOneDay"),
                threeMinute, threeMinutes, tenDays, threeWeeks, twoYearsSixMonthsOneDay);
    }


}
