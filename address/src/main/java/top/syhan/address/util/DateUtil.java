package top.syhan.address.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @program: address
 * @description:
 * @author: SYH
 * @Create: 2021-10-08 22:46
 **/
public class DateUtil {
    private static final String DATE_PATTERN = "yyyy.MM.dd";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static String format(LocalDate date) {
        if(date == null){
            return null;
        }
        return DATE_FORMATTER.format(date);
    }

    public static LocalDate parse(String dateString) {
        try {
            return DATE_FORMATTER.parse(dateString, LocalDate::from);
        }catch (DateTimeParseException e) {
            return null;
        }
    }

    public static boolean validDate(String dateString) {
        //Try to parse the String
        return DateUtil.parse(dateString) != null;
    }
}
