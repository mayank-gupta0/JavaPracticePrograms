package MultiThreading;

class thdemo implements Runnable
{
    @Override
    public void run() {
        System.out.println("\n Name : " + Thread.currentThread().getName() + "\t"
        + Thread.currentThread().getState());
    }
}
public class threadgroupdemo {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("MyThreadGroup");
        Thread th1=new Thread(tg, new thdemo(), "thread1" );
        Thread th2=new Thread(tg, new thdemo(), "thread2" );
        Thread th3=new Thread(tg, new thdemo(), "thread3" );

        th1.start();
        th2.start();
        th3.start();

        System.out.println("\n Number of Active Threads :" + tg.activeCount());
        tg.list();
    }
}
