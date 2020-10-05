package week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author DELL
 * @Date 2020/10/5
 **/
public class ArrayTest {
    static int MAX = 5;
    public static void main(String[] args) {
        int[] a = new int[MAX];

        Random random = new Random();

        for (int i = 0; i < MAX; i++){
            a[i] = random.nextInt(100);
            System.out.println(a[i] + "");
        }

        int max = a[0];
        int min = a[0];
        int count = a[0];
        for (int i = 1; i < MAX; i++){
            if (max < a[i]){
                max = a[i];
            }if (min > a[i]){
                min = a[i];
            }
            count = count + a[i];
        }
        System.out.println("count:" + count);
        System.out.println("max:" + max);
        System.out.println("min:" + min);

        //选择排序
        for (int i = 0; i < MAX; i++){
            for (int j = i+1; j < MAX; j++){
                if (a[i] < a[j]){
                    int h = 0;
                    h = a[i];
                    a[i] = a[j];
                    a[j] = h;
                }
            }
            System.out.println("排序一，降序：" + a[i]);
        }

        System.out.println("<-------------------------手动分界线----------------------->");

        //冒泡排序
        for (int i = 0; i < MAX; i++){
            for (int j = 0; j < MAX-1 ; j++){
                if (a[j] > a[j+1]){
                    int h = a[j];
                    a[j] = a[j+1];
                    a[j+1] = h;
                }
            }
        }
    }
}
