package week14;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName CarouselThread
 * @Description 图片轮播线程
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class CarouselThread implements Runnable{
    private String[] imgs = {
            "https://tyttpe.oss-cn-hangzhou.aliyuncs.com/student/1.png",
            "https://tyttpe.oss-cn-hangzhou.aliyuncs.com/student/2.png",
            "https://tyttpe.oss-cn-hangzhou.aliyuncs.com/student/3.png",
            "https://tyttpe.oss-cn-hangzhou.aliyuncs.com/student/4.png"
    };

    /*
    * 创建显示图片的组件
    */
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;
        while (true){
            try {
                // 创建URL
                URL url = new URL(imgs[index]);
                // 创建了连接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(2000);
                // 得到连接的输入流
                InputStream is = conn.getInputStream();
                // 字节缓冲输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                // 缓冲区
                byte[] buffer = new byte[1024];
                int length;
                // 通过缓冲区读取文件
                while ((length = is.read(buffer)) != -1){
                    baos.write(buffer,0,length);
                }
                byte[] bytes = baos.toByteArray();
                // 将字节数组通过字节输入流读入
                is.read(bytes);
                // 通过bytes构建图标icon
                Icon icon = new ImageIcon(bytes);
                // 将icon设置为背景标签的图标
                this.bgLabel.setIcon(icon);
                Thread.sleep(5000);
                baos.close();
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            index ++;
            // 处理数组最后一个元素
            if (index == len){
                index = 0;
            }
        }
    }
}
