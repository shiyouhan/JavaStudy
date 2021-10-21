package top.syhan.java.oop.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 10:55
 **/
public class MyDate extends Date {

    public void getGMT() {
        Calendar cd = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        df.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        System.out.println(df.format(cd.getTime()));
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(this);
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
        myDate.getGMT();
    }
}
