package week3;

import java.util.Date;

/**
 * @ClassName OverloadTestApp
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class OverloadTestApp {
    public static void main(String[] args) {
        String sum1 = OverLoadTest.sum(30, 50);
        System.out.println(sum1);

        String sum2 = OverLoadTest.sum(2530, 1250);
        System.out.println(sum2);

        Date date = new Date();
        System.out.println(FormatUtil.format(date));
    }
}
