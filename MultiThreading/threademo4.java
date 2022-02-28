package MultiThreading;

class t3 implements Runnable
{
    public void run()
    {
        try {
            for (int i = 1; i <= 10; ++i) {
                System.out.println("\n Name : " + Thread.currentThread().getName() + "\t i =" + i);
                Thread.sleep(2000);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
public class threademo4 {
    public static void main(String[] args) {
        //create two objects of custom thread class
        t3 ob1=new t3();
        t3 ob2=new t3();

        //create two object of thread class and pass the two thread objects and name
        Thread th1=new Thread(ob1,"Thread1");
        Thread th2=new Thread(ob2,"Thread2");

        th1.start(); //this shall automatically call run
        th2.start();
    }
}
