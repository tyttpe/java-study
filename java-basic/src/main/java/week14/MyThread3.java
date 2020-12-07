package week14;

import java.security.Key;
import java.util.concurrent.*;


/**
 * @ClassName MyThread3
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class MyThread3 implements Callable<String> {
    public static int tickets = 20;
    public static Object object = new Object();
    public static String Key = "没票了";

    @Override
    public String call() throws Exception {
        while (true) {
            synchronized (object){
                if (tickets > 0) {
                    System.out.printf("%s线程正在卖出第%d张票\n",
                            Thread.currentThread().getName(), tickets);
                    --tickets;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else{
                    return Key;
                }
            }
        }
    }

    public static void main(String[] args){
        MyThread3 myThread3 = new MyThread3();
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(myThread3);
        service.submit(myThread3);
        service.submit(myThread3);
        Future<String> result = service.submit(myThread3);
        service.shutdown();
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
