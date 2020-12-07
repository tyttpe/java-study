package week14;

import lombok.SneakyThrows;

import javax.swing.*;
import java.io.*;

/**
 * @ClassName TextThread
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class TextThread implements Runnable{
    private JLabel textLable;
    private String line = null;

    public void setTextLable(JLabel textLable){
        this.textLable = textLable;
    }

    @SneakyThrows
    @Override
    public void run(){
        String pathName = "D:\\test.txt";
        File file = new File(pathName);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        br.mark((int) file.length() + 1);
        while (true){
            line = br.readLine();
            if (line != null) {
                textLable.setText(line);
            }else if (line == null){
                br.reset();
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
