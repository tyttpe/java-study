package week1;

/**
 * @ClassName Fac
 * @Description TODO
 * @Author DELL
 * @Date 2020/10/5
 **/
public class Fac {

    public static void main(String[] args) {
        //定义一个整型变量
        int n = 5;
        int result = 1;
        for (int i = 1; i <= n;i++){
            result = result*i;
        }
        System.out.println(result);

    }
}
