package MultiThreading;

class t9 extends Thread
{
    public t9(String tname)
    {
        super(tname);
    }
    public void run()
    {
        if(currentThread().isDaemon())
            System.out.println("\n Deamon thread Working");
        else
            System.out.println("\n User thread Working");
    }
}
public class threaddemo9 {
    public static void main(String[] args) {
        t9 th1=new t9("Thread1");
        t9 th2=new t9("Thread2");
        t9 th3=new t9("Thread3");
        t9 th4=new t9("Thread4");

        //first set the thread as deamon then start the thread
        //else it shall raise Exception
        
        th1.setDaemon(true);
        th1.start();

         //this shall automatically call run
        th2.start();
        th3.start();
        th4.start();
    }
}
