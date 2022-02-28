package MultiThreading;
class cl502
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
        System.out.println("]");
    }
}

class sync3 extends Thread
{
    private String str;
    cl502 ob;
    public sync3(cl502 tob, String tstr)
    {
        str=tstr;
        ob=tob;
        start();
    }
    public void run()
    {
        synchronized (ob) {
            ob.display(str);
        }
    }
}

public class wsynchronization {
    public static void main(String[] args) {
        cl502 ob=new cl502();
        sync3 t1=new sync3(ob,"India");
        sync3 t2=new sync3(ob, "Is");
        sync3 t3=new sync3(ob,"Great");
    }
}
