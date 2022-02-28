package MultiThreading;
import java.util.concurrent.*;

class threadpooldemo implements Runnable
{
    private String str;

    public threadpooldemo(String tstr)
    {
        str=tstr;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "\t Start:" +
                str);
        waitthread();
        System.out.println(Thread.currentThread().getName() + "\t End:" +
                str);
    }

    public void waitthread()
    {
        try
        {
            Thread.sleep(500);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
public class threaddemo10 {
    public static void main(String[] args) {
        //create a thread pool of 5 threads
        ExecutorService ser=Executors.newFixedThreadPool(5);

        for(int i=1; i<=10; ++i)
        {
            //anonymous thread objects
            Runnable runref=new threadpooldemo("Thread " + i);
            ser.execute(runref); //submitted thread
        }
        
        ser.shutdown();

        while(!ser.isTerminated())
        {}

        System.out.println("Well all threads are completed");
    }
}
