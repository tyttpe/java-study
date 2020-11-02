package week5;

import java.io.*;

/**
 * @ClassName ExceptionTest2
 * @Description 编译时异常练习
 * @Author TYTTPE
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) {
        // 在方法调用处捕获异常，这样做的好处是：即使出现异常也可以处理
        try {
            byte[] b = readFile("D://123.jpg");
            System.out.println(b.length);
        } catch (IOException e) {
            System.err.println("出现IO异常");
        } finally {
            System.out.println("无论有无异常都会执行的代码段");
        }
        System.out.println("其他代码");

    }

    /**
     * 用throws关键字在方法签名处声明异常
     *
     * @param path: 文件路径
     * @return b:字节数组
     * @throws IOException
     */
    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return b;
    }
}
