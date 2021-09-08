package utils.newDate;

import org.junit.jupiter.api.Test;
import utils.utils;

import java.time.*;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class d6 {

    /**
     * getRules() 获取指定时区的规则
     */
    @Test
    public void d1() {
        ZoneId romeZone = ZoneId.of("Europe/Rome");
        System.out.println(romeZone.getRules());
    }


    /**
     * TimeZone 获取 ZoneId
     */
    @Test
    public void d2() {
        ZoneId zoneId = TimeZone.getDefault().toZoneId();
        System.out.println(zoneId);
    }


    /**
     * 为时间点添加时区信息
     */
    @Test
    public void d3() {
        ZoneId romeZone = ZoneId.of("Europe/Rome");

        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zdt1 = date.atStartOfDay(romeZone);
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(romeZone);
        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(romeZone);

        utils.toPrintln(List.of("zdt1", "zdt2", "zdt3"), zdt1, zdt2, zdt3);
    }


    @Test
    public void d4() {
        ZoneId romeZone = ZoneId.of("Europe/Rome");

        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
//        Instant instantFromDateTime = dateTime.toInstant();

//        System.out.println(instantFromDateTime);
    }


    @Test
    public void d5() {
        ZoneId romeZone = ZoneId.of("Europe/Rome");
        Instant instant = Instant.now();
        LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant, romeZone);
        System.out.println(timeFromInstant);
    }


    /**
     * date 通过 instant 与 localDateTime 转换
     */
    @Test
    public void d6() {
        ZoneId romeZone = ZoneId.of("Asia/Shanghai");
        Instant instant = new Date().toInstant();
        LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant, romeZone);

        System.out.println(timeFromInstant);
    }



}
