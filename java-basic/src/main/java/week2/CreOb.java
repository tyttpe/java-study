package week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName CreOb
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreOb {
    private String i;
    private String j;
    public static void main(String[] args) {
        CreOb creOb = new CreOb();

        try {
            CreOb creOb1 = (CreOb) creOb.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        try {
            Class c = Class.forName("week2.CreOb");
            CreOb creOb1 = (CreOb) c.newInstance();

            Constructor constructor = c.getConstructor();
            CreOb creOb2 =(CreOb) constructor.newInstance("1","2");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        @SuppressWarnings("source")
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("data.obj"));
            CreOb creOb1 = (CreOb) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
