package com.laohe.threadpool;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.*;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/22 14:16
 */
public class Main implements Callable {
    public static void main(String[] args) throws InterruptedException, ParseException {
        String date = "19990913";
        Date date1 = DateUtils.parseDate(date, "yyyyMMdd");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate yyyyMMdd = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(yyyyMMdd);
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
