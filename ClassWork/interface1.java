package ClassWork;
import ClassWork.myinterface1;
import java.util.*;

class si implements myinterface1 //concrete class
{
    private float pr;
    private float rate;
    private float time;
    private float inte;

    public void readdata()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter principal amount :");;
        pr=scn.nextFloat();
        System.out.println("\n Enter rate of annual interest :");;
        rate=scn.nextFloat();
        System.out.println("\n Enter time in years :");;
        time=scn.nextFloat();
    }
    public void calc()
    {
        inte=pr*rate*time*0.01f;
    }

    public void disp()
    {
        System.out.println("\n Simple Interest : " + inte);
    }
}

class circlee implements myinterface1 //concrete class
{
    private float rad;
    private float ar;
    private float pr;

    public void readdata()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter radius of circle :");;
        rad=scn.nextFloat();
    }
    public void calc()
    {
        pr=(float)(2*Math.PI*rad);
        ar=(float)(Math.PI*rad*rad);
    }
    public void disp()
    {
        System.out.println("\n Area : " + ar);
        System.out.println("\n Perimeter : " + pr);
    }
}

public class interface1 {
    public static void main(String[] args) {
        si o1=new si();
        o1.readdata();
        o1.calc();
        o1.disp();

        circlee o2=new circlee();
        o2.readdata();
        o2.calc();
        o2.disp();

        myinterface1 ref=new si(); //upcasting
        ref.readdata();
        ref.calc();
        ref.disp();

        ref=new circlee();
        ref.readdata();
        ref.calc();
        ref.disp();
    }
}
