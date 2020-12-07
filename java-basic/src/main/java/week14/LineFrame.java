package week14;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LineFrame
 * @Description 绘制线段的窗体
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class LineFrame extends JFrame {
    public LineFrame(){
        init();
        getContentPane().setBackground(new Color(0,0,0));
        setTitle("Line frame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void init(){
        LineThread lt = new LineThread();
        lt.setFrame(this);
        new Thread(lt).start();
    }

    public static void main(String[] args) {
        new LineFrame();
    }
}
