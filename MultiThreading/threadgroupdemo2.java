package MultiThreading;

class thdemo2 extends Thread
{
    public thdemo2(String tnm)
    {
        super(tnm);
    }
    @Override
    public void run() {
        System.out.println("\n Name : " + Thread.currentThread().getName() + "\t"
                + Thread.currentThread().getState());
    }
}
public class threadgroupdemo2 {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("MyThreadGroup");

        Thread th1=new Thread(tg, new thdemo2("t1"), "Thead1");
        Thread th2=new Thread(tg, new thdemo2("t2"), "Thread2");
        Thread th3=new Thread(tg, new thdemo2("t3"), "Thread3");

        th1.start();
        th2.start();
        th3.start();

        System.out.println("\n Number of Active Threads :" + tg.activeCount());
        tg.list();
    }
}
