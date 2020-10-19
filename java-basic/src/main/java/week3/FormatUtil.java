package week3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName FormatUtil
 * @Description 格式化工具类
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class FormatUtil {


    public synchronized static String format(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public synchronized static String format(Date date,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public synchronized static String format(Date date, Locale tz){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyy",tz);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(date.getTime());
    }

    public synchronized static String format(double number){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(number);
    }

    public synchronized static String format(double number,String pattern){
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(number);
    }

    public synchronized static String format(long transform){
        return "";
    }
}
