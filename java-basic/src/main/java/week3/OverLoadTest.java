package week3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class OverLoadTest {
    /*public static int sum(int a ,int b){
        return a + b;
    }*/

    public static String sum(String s1, String s2) {
        //两个字符串相加并不是在第一个字符串后拼接，而是创建一个新的空间
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s1);
        stringBuffer.append(s2);
//        return stringBuffer.toString();
        return s1 + s2;
    }

    public static String sum(int d1,int d2){
      int h = d1 + d2;
        if (h < 3600){
            int min = h / 60;
            int m = h % 60;
            return min + "分钟" + m + "秒";
        }
        int hour = h / 3600;
        int min = (h - hour * 3600) / 60;
        int m = (h - hour * 3600) % 60;
		return hour + "小时" + (min == 0 ? "" : min + "分钟") +  (m == 0 ? "" : m + "秒");
    }

}
