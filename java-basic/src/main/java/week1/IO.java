package week1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @ClassName IO
 * @Description TODO
 * @Author DELL
 * @Date 2020/10/6
 **/
public class IO {
    static int MAX = 100;


    public static void main(String[] args) {
        String PATH = "D:\\test.txt";
        IO io = new IO();
        io.writeFileByFileWrite(PATH);

    }

    public void writeFileByFileWrite(String PATH){
        try {
            File file = new File(PATH);
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(PATH);
            for (int i = 0; i < MAX ; i++){
                int[] ar = new int[MAX];
                Random random = new Random();
                ar[i] = random.nextInt(100);
                System.out.println(ar[i]);
                fw.write("" + ar[i] + "\r\n" );
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
