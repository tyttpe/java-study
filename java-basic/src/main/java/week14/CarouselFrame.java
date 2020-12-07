package week14;

import javax.swing.*;
import java.awt.*;


/**
 * @ClassName CarouselFrame
 * @Description 图片轮播窗体
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class CarouselFrame extends JFrame {
    private JLabel bgLabel;
    private JLabel timeLabel;
    private JLabel textLabel;

    public CarouselFrame(){
        init();
        setResizable(true);
        setTitle("CarouselFrame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void init(){
        bgLabel = new JLabel();
        timeLabel = new JLabel();
        textLabel = new JLabel();
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
        TimeThread tt = new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();
        TextThread ttt = new TextThread();
        ttt.setTextLable(textLabel);
        new Thread(ttt).start();
        this.getContentPane().add(bgLabel,BorderLayout.CENTER);
        timeLabel.setFont(new Font("微软雅黑",Font.BOLD,24));
        this.getContentPane().add(timeLabel,BorderLayout.SOUTH);
        this.getContentPane().add(textLabel,BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
