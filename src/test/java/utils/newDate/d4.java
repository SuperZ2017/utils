package utils.newDate;

import org.junit.jupiter.api.Test;
import utils.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class d4 {


    /**
     * #withAttribute 会重新创建对象，并按照需要修改它的属性，这不会改变原来的对象
     */
    @Test
    public void d1() {
        LocalDate date1 = LocalDate.of(2017, 9, 21);
        LocalDate date2 = date1.withYear(2011);
        LocalDate date3 = date2.withDayOfMonth(25);
        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 2);

        utils.toPrintln(List.of("date1", "date2", "date3", "date4"), date1, date2, date3, date4);
    }



    @Test
    public void d2() {
        LocalDate date1 = LocalDate.of(2017, 9, 21);
        LocalDate date2 = date1.plusWeeks(1);
        LocalDate date3 = date2.minusYears(6);
        LocalDate date4 = date3.plus(6, ChronoUnit.MONTHS);

        utils.toPrintln(List.of("date1", "date2", "date3", "date4"), date1, date2, date3, date4);
    }


    /**
     * 通过 TemporalAdjusters 类的静态工厂方法调整时间
     */
    @Test
    public void d3() {
        LocalDate date1 = LocalDate.of(2021, 9, 8);
        LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));     // 下一个星期天
        LocalDate date3 = date2.with(TemporalAdjusters.lastDayOfMonth());   // 月底

        utils.toPrintln(List.of("date1", "date2", "date3"), date1, date2, date3);
    }
}
