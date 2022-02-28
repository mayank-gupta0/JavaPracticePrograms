package MultiThreading;

class t2 implements Runnable
{
    public void run()
    {
        for(int i=1; i<=10; ++i)
            System.out.println("\n Name : " + Thread.currentThread().getName() + "\t i =" +i);
    }
}
public class threaddemo3 {
    public static void main(String[] args) {
        //create two objects of custom thread class
        t2 ob1=new t2();
        t2 ob2=new t2();
        //create two object of thread class and pass the two thread objects and name

        Thread th1=new Thread(ob1,"Thread1");
        Thread th2=new Thread(ob2,"Thread2");

        th1.start(); //this shall automatically call run
        th2.start();
    }
}












