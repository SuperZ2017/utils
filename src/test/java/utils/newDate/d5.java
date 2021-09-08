package utils.newDate;

import org.junit.jupiter.api.Test;
import utils.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class d5 {

    /**
     * 使用 DateTimeFormatter 预定义实例 格式化日期时间
     */
    @Test
    public void d1() {
        LocalDate date = LocalDate.of(2014, 3, 18);
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        utils.toPrintln(List.of("date", "s1", "s2"), date, s1, s2);
    }


    /**
     * 字符串 -> LocalDate
     */
    @Test
    public void d2() {
        LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);

        utils.toPrintln(List.of("date1", "date2"), date1, date2);
    }


    /**
     * 按照某个模式创建 DateTimeFormatter
     */
    @Test
    public void d3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.of(2014, 3, 18);
        String formattedDate = date.format(formatter);
        LocalDate date1 = LocalDate.parse(formattedDate, formatter);

        utils.toPrintln(List.of("formattedDate", "date1"), formattedDate, date1);
    }
}
