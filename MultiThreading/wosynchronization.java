package MultiThreading;
class cl500
{
    public void display(String str)
    {
        System.out.println("[" + str);
        try
        {
            Thread.sleep(500);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.print("]");
    }
}

class sync1 extends Thread
{
    private String str;
    cl500 ob;
    public sync1(cl500 tob, String str1)
    {
        str=str1;
        ob=tob;
        start();
    }
    public void run()
    {
        ob.display(str);
    }
}

public class wosynchronization {
    public static void main(String[] args) {
        cl500 tob=new cl500();
        sync1 t1=new sync1(tob, "India");
        sync1 t2=new sync1(tob, "Is");
        sync1 t3=new sync1(tob, "Great");
    }
}
