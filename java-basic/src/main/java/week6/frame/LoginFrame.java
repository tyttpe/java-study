package week6.frame;

import week6.service.LoginService;
import week6.service.impl.LoginServiceImpl;
import week6.utils.RoundBorder;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 * @ClassName LoginFrame
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/9
 **/
public class LoginFrame extends JFrame{
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JTextField userTextFiled;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel loginLabel;
    private JLabel tipLabel;
    private JLabel logoLabel;

    public LoginFrame() {
        init();


        loginButton.addActionListener(e -> {
               LoginService ll = new LoginServiceImpl();
               String account = userTextFiled.getText();
               char[] password = passwordField1.getPassword();
               String passString = new String(password);
                boolean result = true;
                try {
                    result = ll.login(account,passString);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                if (result){
                   JOptionPane.showMessageDialog(null,"登录成功，欢迎回来：" + account);
                   LoginFrame.this.dispose();
                   new MainFrame();
                }else if (result == false){
                    JOptionPane.showMessageDialog(null,"登录失败" );
                    userTextFiled.setText("");
                    passwordField1.setText("");
                }

        });
    }

    private void init(){
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        userTextFiled.setBorder(new RoundBorder(Color.LIGHT_GRAY));
        passwordField1.setBorder(new RoundBorder(Color.LIGHT_GRAY));
    }



    public static void main(String[] args) {
        new LoginFrame();
    }
}
