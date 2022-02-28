package MultiThreading;
class cl602
{
    synchronized public void printTable(int n)
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

class sync7 extends Thread
{
    int n;
    cl602 ob;
    public sync7(cl602 tob, int tn)
    {
        this.ob=tob;
        this.n=tn;
    }
    public void run()
    {
        ob.printTable(n);
    }
}

class sync8 extends Thread
{
    int n;
    cl602 ob;
    public sync8(cl602 tob, int tn)
    {
        this.ob=tob;
        this.n=tn;
    }
    public void run()
    {
        ob.printTable(n);
    }
}
public class wsynchronization4 {
    public static void main(String[] args) {
            cl602 ob=new cl602();
            sync7 th1=new sync7(ob, 5);
            sync8 th2=new sync8(ob, 10);

            th1.start();
            th2.start();
        }
    }
