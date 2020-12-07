package week1;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName IO
 * @Description TODO
 * @Author DELL
 * @Date 2020/10/6
 **/
public class IO {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        String fileName = UUID.randomUUID().toString();
        File file = new File("D:\\" + fileName + ".txt");
        Writer out = new FileWriter(file,true);
        out.write(chars);
        out.close();

        String fileName2 = UUID.randomUUID().toString();
        String PATH = "D:\\" + fileName2 + ".txt";
        IO io = new IO();
        io.writeFileByFileWrite(PATH);

        String fileName3 = UUID.randomUUID().toString();
        PrintStream ps = null ;
        ps = new PrintStream(new FileOutputStream(new File("d:\\" + fileName3 + ".txt"))) ;
        ps.print(s) ;
        ps.close() ;

        String fileName4 = UUID.randomUUID().toString();
        String path = "D:\\" + fileName4 + ".txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(s);
        bufferedWriter.close();

        StringWriter stringWriter = new StringWriter();
    }

    public void writeFileByFileWrite(String PATH){
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File(PATH);
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(PATH);
            for (int i = 0; i < 2 ; i++){
                String[] ar = new String[2];
                ar[i] = scanner.nextLine();
                System.out.println(ar[i]);
                fw.write("" + ar[i] + "\r\n" );
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
