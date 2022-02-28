package ClassWork;

class clB1
{
    protected int x;
    public void show()
    {
        System.out.println("\n ClB1 x : " + x);
    }
}
class clB2 extends clB1
{
    private int x;
    public void readdata()
    {
        super.x=100;
        this.x=200;
    }
    public void disp()
    {
        System.out.println("\n super x : " + super.x);
        System.out.println("\n clB2 x  : " + x);
    }
}
public class super1 {
    public static void main(String[] args) {
        clB2 ob=new clB2();
        ob.readdata();
        ob.disp();
        ob.show();
    }
}
