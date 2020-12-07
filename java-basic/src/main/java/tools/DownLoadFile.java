package tools;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName DownLoadFile
 * @Description 字节流结合URL编程实现文件的下载
 * @Author TYTTPE
 * @Date 2020/11/30
 **/
public class DownLoadFile {
    public static void main(String[] args) {

    }

    public static void download(String urlString,String fileName,String savePath) throws IOException {
        // 构造url
        URL url = new URL(urlString);
        // 打开连接
        URLConnection conn = url.openConnection();
        // 设置请求超时
        conn.setConnectTimeout(5000);
        // 构建输入流
        InputStream is = conn.getInputStream();
        // 定义数据缓冲
        byte[] bytes = new byte[1024];
        // 读取的数据长度
        int len;
        // 创建文件对象
        File file = new File(savePath);
        if (!file.exists()){
            file.mkdirs();
        }
        // 构建输出文件流
        OutputStream os = new FileOutputStream(file.getPath() + File.separator + fileName);
        // 开始读取，每次读取缓冲区大小的字节数
        while ((len = is.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        // 关闭连接
        os.close();
        is.close();
    }
}
