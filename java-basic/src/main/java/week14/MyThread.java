package week14;

/**
 * @ClassName MyThread
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class MyThread extends Thread{
    public static int tickets = 30;
    public static String str = new String("哈哈");

    @Override
    public void run() {
        while (true) {
                if (tickets > 0) {
                    System.out.printf("%s线程正在卖出第%d张票\n",
                            Thread.currentThread().getName(), tickets);
                    --tickets;
                } else {
                    break;
                }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("窗口1");
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.setName("窗口2");
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.setName("窗口3");
        myThread2.start();
        MyThread myThread3 = new MyThread();
        myThread3.setName("窗口4");
        myThread3.start();
        MyThread myThread4 = new MyThread();
        myThread4.setName("窗口5");
        myThread4.start();
    }
}


