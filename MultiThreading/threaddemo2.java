package MultiThreading;

class t1 extends Thread
{
    public t1(String tname)
    {
        super(tname);
    }
    public void run()
    {
        for(int i=1; i<=10; ++i)
            System.out.println("\n Name : " + currentThread().getName() + "\t i =" +i);
    }
}
public class threaddemo2 {
    public static void main(String[] args) {
        t1 th1=new t1("Thread1");
        t1 th2=new t1("Thread2");

        th1.start(); //this shall automatically call run
        th2.start();
    }
}
