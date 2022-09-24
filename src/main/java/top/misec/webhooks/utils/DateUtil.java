package top.misec.webhooks.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 日期工具类
 *
 * @author moshi
 */
public class DateUtil {

    /**
     * 日期格式化为字符串
     *
     * @param source source
     */
    public static Date string2date(String source) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(source);

    }

    /**
     * 字符串解析为日期
     *
     * @param source source
     */
    public static String date2String(Date source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(source);
    }

    /**
     * @param calendar 当前的calendar
     * @param day      往前或者往后推几天
     * @return 目标日期的0点时间.
     */
    public static String getZeroTime(Calendar calendar, int day) {
        return date2String(getZeroTimeDate(calendar, day));
    }

    /**
     * @param calendar 当前的calendar
     * @param day      往前或者往后推几天
     * @return 目标日期的0点时间.
     */
    public static Date getZeroTimeDate(Calendar calendar, int day) {
        Calendar targetCalendar = (Calendar) calendar.clone();
        targetCalendar.add(Calendar.DAY_OF_MONTH, day);
        targetCalendar.set(Calendar.HOUR_OF_DAY, 0);
        targetCalendar.set(Calendar.MINUTE, 0);
        targetCalendar.set(Calendar.SECOND, 0);
        targetCalendar.set(Calendar.MILLISECOND, 0);
        return targetCalendar.getTime();
    }

    /**
     * @param day 往前或者往后推几天
     * @return 往前或者往后推几天
     */
    public static Date getTimeDate(int day) {
        Calendar today = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"));
        today.setTimeInMillis(System.currentTimeMillis());
        today.add(Calendar.DAY_OF_MONTH, day);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return today.getTime();
    }

}
