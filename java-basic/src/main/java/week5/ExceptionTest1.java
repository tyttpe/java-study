package week5;

import java.util.Scanner;

/**
 * @ClassName ExceptionTest1
 * @Description 运行时异常的练习
 * @Author TYTTPE
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
//        // 1.ArithmeticException 算术异常
//           int result = 0;
//        try {
//           result = 3 / 0;
//        }catch (ArithmeticException e){
//           System.err.println("除数不能为0！");
//           System.err.println(e.getMessage());
//        // e.printStackTrace();
//        }
//        System.out.println(result);


//        // 2. ArrayIndexOutOfBoundsException 数组索引越界异常
//           int[] a = {1,2,3,4,5};
//        try {
//           System.out.println(a[5]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("数组索引过界！");
//            System.err.println("异常的原因：" + e.getCause());
//            System.err.println("异常详情信息：" + e.getMessage());
//            System.err.println("异常对象e：" + e.toString());
//        }

        // 3. NumberFormatException 数字格式化异常
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        // 从键盘读入一串字符
        String priceStr = scanner.nextLine();
        // 将字符串转换为整型
        int price = 0;
        try {
            price = Integer.parseInt(priceStr);
        }catch (NumberFormatException e){
            System.err.println("数字格式化异常");
            System.err.println("异常详情信息：" + e.getMessage());
            System.err.println("异常原因：" + e.getCause());
        }
        System.out.println("price =" + price);

        // 4. NPE NullPointException 空指针异常

    }
}
