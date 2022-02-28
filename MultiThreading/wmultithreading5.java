package MultithreadingJava;
class cl603
{
    public void printTable(int n)
    {
        for(int i=1; i<=10; ++i) {
            System.out.println("\n" + n + "x" + i + "=" + (n * i));
            try
            {
                Thread.sleep(300);
            }
            catch(Exception ex)
            {}
        }
    }
}

class sync9 extends Thread
{
    int n;
    cl603 ob;
    public sync9(cl603 tob, int tn)
    {
        this.ob=tob;
        this.n=tn;
    }
    public void run()
    {
        //implemented using synchronized block
        synchronized (ob) {
            ob.printTable(n);
        }
    }
}

class sync10 extends Thread
{
    int n;
    cl603 ob;
    public sync10(cl603 tob, int tn)
    {
        this.ob=tob;
        this.n=tn;
    }
    public void run()
    {
        synchronized (ob) {
            ob.printTable(n);
        }
    }
}
public class wmultithreading5 {
    public static void main(String[] args) {
        cl603 ob=new cl603();
        sync9 th1=new sync9(ob, 5);
        sync10 th2=new sync10(ob, 10);

        th1.start();
        th2.start();
    }
}
