package MultiThreading;
class t5 implements Runnable
{
    public void run()
    {
        try {
            for (int i = 1; i <= 3; ++i) {
                System.out.println("\n Name : " + Thread.currentThread().getName() + "\t i =" + i);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
public class threaddemo6 {
    public static void main(String[] args) {
            //create two objects of custom thread class
            t5 ob1=new t5();
            t5 ob2=new t5();

            //create two object of thread class and pass the two thread objects and name
            Thread th1=new Thread(ob1);
            Thread th2=new Thread(ob2);

            th1.setName("thread1");
            th2.setName("thread2");

            System.out.println("\n Thread1 ID : " + th1.getId());
            System.out.println("\n Thread2 ID : " + th2.getId());

            th1.start(); //this shall automatically call run
            th2.start();
    }
}
