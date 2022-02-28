package MultiThreading;

public class anonymousrunnable {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Name :" + Thread.currentThread().getName());
                System.out.println("This is runnable1");
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                System.out.println("Name :" + Thread.currentThread().getName());
                System.out.println("This is runnable2");
            }
        };

        Thread t1=new Thread(r1, "thread1");
        Thread t2=new Thread(r2, "thread2");

        t1.start();
        t1.join(500);
        t2.start();
    }
}
