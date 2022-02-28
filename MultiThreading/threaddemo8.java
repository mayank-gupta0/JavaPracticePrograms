package MultiThreading;
class t8 implements Runnable
{
    public void run()
    {
        try {
            for (int i = 1; i <= 10; ++i) {
                System.out.println("\n Name : " + Thread.currentThread().getName() + "\t i =" + i);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
public class threaddemo8 {
    public static void main(String[] args) {
        t8 ob1=new t8();
        t8 ob2=new t8();
        t8 ob3=new t8();

        //create two object of thread class and pass the two thread objects and name
        Thread th1=new Thread(ob1,"Thread1");
        th1.setPriority(10);
        Thread th2=new Thread(ob2,"Thread2");
        th2.setPriority(5);
        Thread th3=new Thread(ob3,"Thread3");
        th3.setPriority(1);

        th1.start(); //this shall automatically call run
        th2.start();
        th3.start();
    }
}
