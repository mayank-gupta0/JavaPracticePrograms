package ClassWork;

class clB6
{
    private int x;
    private int y;

    public clB6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void disp()
    {
        System.out.println("\n x = " + x + "\t y =" + y);
    }
}

class clB7 extends clB6
{
    private int a;
    private int b;

    public clB7(int p1, int p2, int p3, int p4) {
        super(p1,p2);
        this.a = p3;
        this.b = p4;
    }

    public void disp()
    {
        super.disp();
        System.out.println("\n a = " + a + "\t b =" + b);
    }
}

public class super3 {
    public static void main(String[] args) {
        clB7 ob=new clB7(1,2,3,4);
        ob.disp();
    }
}