package utils.newDate;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class d1 {


    /**
     * 通过静态工厂方法 of 创建一个 LocalDate 实例，
     * 实例提供了多种方法来读取常用的值，比如年份、月份、星期几等
     */
    @Test
    public void l1() {
        LocalDate date = LocalDate.of(2021, 9, 8);
        int year = date.getYear();
        Month month = date.getMonth();
        int months = month.getValue();
        int monthValue = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("=== year : " + year + "====");
        System.out.println("=== months : " + months + "====");
        System.out.println("=== monthValue : " + monthValue + "====");
        System.out.println("=== day : " + day + "====");

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear();   // 是否是闰年

        System.out.println("=== dayOfWeek : " + dayOfWeek + "====");
        System.out.println("=== len : " + len + "====");
        System.out.println("=== leap : " + leap + "====");
    }


    /**
     * 使用工厂方法now从系统时钟中获取当前的日期
     */
    @Test
    public void l2() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }


    /**
     * 使用 TemporalField 读取 LocalDate 的值，等价于 l1 方法
     */
    @Test
    public void l3() {
        LocalDate date = LocalDate.now();
        int year = date.get(ChronoField.YEAR);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);
    }
}
