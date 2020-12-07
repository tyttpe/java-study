package week13;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName FileTest
 * @Description file测试类
 * @Author TYTTPE
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
        // 创建文件
        /*File file = new File("D:" + File.separator + "test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());*/

        // 课堂练习1-1：创建目录，用当前系统时间命名，注意判读是否存在
        LocalDate today = LocalDate.now();
        String dirName = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
        File dir = new File("D:\\" + dirName);
        if (!dir.exists()){
            boolean flag = dir.mkdir();
            System.out.println(flag);
        }

        // 课堂练习1-2：删除1-1创建的的目录，判读时候存在
        if (dir.exists()){
            boolean flag = dir.delete();
            System.out.println(false);
        }

        // 课堂练习1-3

        File root = new File("D:\\java");
        String[] strings = new String[]{"面向对象","异常","集合","io","多线程"};
        String[] io = new String[]{"字节流","字符流"};

        if (!root.exists()){
            boolean flag = root.mkdir();
            if (flag == true){
                System.out.println(root.getAbsolutePath());
                for (String string : strings){
                    createDir(root,string);
                    if (string.equals("io")){
                        File file = new File(root + "\\" + string);
                        for (String ioStr : io){
                            createDir(file,ioStr);
                        }
                    }
                }
            }
        }
    }

    public static void createDir(File root,String string){
        File file = new File(root.getAbsolutePath() +"\\"+ string);
        if (!file.exists()){
            boolean flag = file.mkdirs();
            if (flag == true){
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
