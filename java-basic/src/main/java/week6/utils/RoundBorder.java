package week6.utils;

import javax.swing.border.Border;
import java.awt.*;

/**
 * @ClassName RoundBorder
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/9
 **/
public class RoundBorder implements Border {
    private Color color;


    public RoundBorder(){
        this(Color.BLACK);
    }

    public RoundBorder(Color color) {
                this.color = color;
    }


    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(color);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawRoundRect(0,0,c.getWidth() -1 ,c.getHeight() -1, 15, 15 );

        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(10,15,10,15);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
