package week13;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

/**
 * @ClassName ReadImage
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/5
 **/
public class ReadImage extends JFrame{
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JButton imageButton;
    private JPanel centerPanel;
    private JLabel imgLabel;

    private File file;
    private BufferedImage image;

    public void init(){
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,1000);
        this.setVisible(true);
    }

    public ReadImage(){
        init();

        imageButton.addActionListener(e ->{
            JFileChooser fileChooser = new JFileChooser(file);
            fileChooser.setCurrentDirectory(new File("D:\\"));
            int result = fileChooser.showOpenDialog(centerPanel);
            if (result == JFileChooser.APPROVE_OPTION){
                file = fileChooser.getSelectedFile();
                try {
                    InputStream is = new FileInputStream(file);
                    byte[] buffer = new byte[1024];
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    int len = 0;
                    while ((len = is.read(buffer)) != -1) {
                        baos.write(buffer, 0, len);
                    }
                    baos.close();
                    imgLabel.setText("");
                    ImageIcon icon = new ImageIcon(baos.toByteArray());
                    Image image = icon.getImage();
                    image = image.getScaledInstance(1200,800,Image.SCALE_DEFAULT);
                    icon.setImage(image);
                    imgLabel.setIcon(icon);
                    centerPanel.add(imgLabel);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        new ReadImage();
    }
}
