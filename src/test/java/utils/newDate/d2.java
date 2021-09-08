package utils.newDate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

public class d2 {

    /**
     * 创建 LocalTime 并读取其值
     */
    @Test
    public void d1() {
        LocalTime time = LocalTime.of(13, 45, 20);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        utils.utils.toPrintln(List.of("hour", "minute", "second"), hour, minute, second);
    }


    /**
     * 通过解析代表它们的字符串创建
     */
    @Test
    public void d2() {
        LocalDate date = LocalDate.parse("2021-09-08");
        LocalTime time = LocalTime.parse("13:45:20");
        utils.utils.toPrintln(List.of("date", "time"), date, time);
    }


    /**
     * LocalDateTime，是 LocalDate 和 LocalTime 的合体。
     * 它同时表示了日期和时间，但不带有时区信息，你可以直接创建，也可以通过合并日期和时间对象创建
     */
    @Test
    public void d3() {
        LocalDate date = LocalDate.parse("2017-09-21");
        LocalTime time = LocalTime.parse("13:45:20");
        LocalDateTime dt1 = LocalDateTime.of(2014, Month.SEPTEMBER, 21, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        utils.utils.toPrintln(List.of("dt1", "dt2", "dt3", "dt4", "dt5"), dt1, dt2, dt3, dt4, dt5);
    }


    /**
     * 从 LocalDateTime 中提取 LocalDate 或者 LocalTime 组件
     */
    @Test
    public void d4() {
        LocalDateTime dt1 = LocalDateTime.of(2014, Month.SEPTEMBER, 21, 13, 45, 20);
        LocalDate date = dt1.toLocalDate();
        LocalTime time = dt1.toLocalTime();
        utils.utils.toPrintln(List.of("date", "time"), date, time);
    }


}
