package week6.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName MainFrame
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
public class MainFrame extends JFrame{
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JButton 院系管理Button;
    private JButton 班级管理Button;
    private JButton 学生管理Button;
    private JButton 奖惩管理Button;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;

    private final CardLayout c;


    public MainFrame(){
        init();
        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1",departmentPanel);
        centerPanel.add("2",classPanel);
        centerPanel.add("3",studentPanel);
        centerPanel.add("4",rewardPanel);
        院系管理Button.addActionListener(e -> {
            c.show(centerPanel,"1");
        });
        班级管理Button.addActionListener(e -> {
            c.show(centerPanel,"2");
        });
        学生管理Button.addActionListener(e -> {
            c.show(centerPanel,"3");
        });
        奖惩管理Button.addActionListener(e -> {
            c.show(centerPanel,"4");
        });
    }

    public void init(){
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
