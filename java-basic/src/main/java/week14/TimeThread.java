package week14;

import javax.swing.*;
import java.time.LocalDateTime;

/**
 * @ClassName TimeThread
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class TimeThread implements Runnable {
    private JLabel timeLabel;
    private int minth = 0;
    private int hours = 0;
    private int sec = 0;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @Override
    public void run() {
        minth = LocalDateTime.now().getMinute();
        hours = LocalDateTime.now().getHour();
        sec = LocalDateTime.now().getDayOfMonth();
        while (true){
            timeLabel.setText(hours + "" + ":" + minth + ":" + sec);
            try {
                Thread.sleep(1000);
                sec++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
