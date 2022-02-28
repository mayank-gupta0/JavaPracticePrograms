package MultiThreading;

class t4 implements Runnable
{
    public void run()
    {
        try {
            for (int i = 1; i <= 4; ++i) {
                System.out.println("\n Name : " + Thread.currentThread().getName() + "\t i =" + i);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
public class threaddemo5 {
    public static void main(String[] args) {
        //create two objects of custom thread class
        t4 ob1=new t4();
        t4 ob2=new t4();

        //create two object of thread class and pass the two thread objects and name
        Thread th1=new Thread(ob1,"Thread1");
        Thread th2=new Thread(ob2,"Thread2");

        th1.start(); //this shall automatically call run
        try
        {
            th1.join(10);
        }
        catch(Exception ex)
        {}
        th2.start();
    }
}
