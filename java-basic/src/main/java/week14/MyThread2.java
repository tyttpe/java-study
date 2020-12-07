package week14;

/**
 * @ClassName MyThread2
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class MyThread2 implements Runnable{
    public static int tickets = 10;
    public static Object object = new Object();

    @Override
    public void run() {
            while (true) {
                synchronized (object){
                if (tickets > 0) {
                    System.out.printf("%s线程正在卖出第%d张票\n",
                            Thread.currentThread().getName(), tickets);
                    --tickets;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread1 = new Thread(myThread2);
        thread1.setName("窗口1");
        thread1.start();
        Thread thread2 = new Thread(myThread2);
        thread2.setName("窗口2");
        thread2.start();
        Thread thread3 = new Thread(myThread2);
        thread3.setName("窗口3");
        thread3.start();
        Thread thread4 = new Thread(myThread2);
        thread4.setName("窗口4");
        thread4.start();
        Thread thread5 = new Thread(myThread2);
        thread5.setName("窗口5");
        thread5.start();
    }
}
