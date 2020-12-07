package week13;

import java.io.*;

import static java.lang.System.out;

/**
 * @ClassName ReadFile
 * @Description 读取本地文件
 * @Author TYTTPE
 * @Date 2020/12/5
 **/
public class ReadFile {
    public static void readTextFile(String path){
        try {
            File file = new File(path);
            if (file.isFile() && file.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
                BufferedReader br = new BufferedReader(isr);
                String lineTxt = null;
                while ((lineTxt = br.readLine()) != null) {
                    out.println(lineTxt);
                }
                br.close();
            } else {
                out.println("文件不存在!");
            }
        } catch (Exception e) {
            out.println("文件读取错误!");
        }
    }

    public static void bufCopyMedia(String fileName) {
        try {
            BufferedInputStream bfis = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("D:\\wolf-copy.jpg"));
            int by;
            byte[] ts = new byte[1024];
            while ((by = bfis.read(ts)) != -1) {
                bfos.write(ts, 0, by);
            }
            bfis.close();
            bfos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //readTextFile("D:\\test.txt");
        bufCopyMedia("D:\\bggo.jpg");
    }
}
