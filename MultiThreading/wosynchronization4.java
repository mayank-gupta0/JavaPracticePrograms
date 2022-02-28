package MultiThreading;
class cl601
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

class sync5 extends Thread
{
    int n;
    cl601 ob;
    public sync5(cl601 tob, int tn)
    {
        this.ob=tob;
        this.n=tn;
    }
    public void run()
    {
        ob.printTable(n);
    }
}

class sync6 extends Thread
{
    int n;
    cl601 ob;
    public sync6(cl601 tob, int tn)
    {
        this.ob=tob;
        this.n=tn;
    }
    public void run()
    {
        ob.printTable(n);
    }
}

public class wosynchronization4 {
    public static void main(String[] args) {
        cl601 ob=new cl601();
        sync5 th1=new sync5(ob, 5);
        sync6 th2=new sync6(ob, 10);

        th1.start();
        th2.start();
    }
}
