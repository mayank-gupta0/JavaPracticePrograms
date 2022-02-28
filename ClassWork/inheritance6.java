package ClassWork;

import java.util.Scanner;
// all cases of overiding
class shape
{
    private String name;
    public void setName(String tname)
    {
        name=tname;
    }
    public String getName()
    {
        return name;
    }
    public void readdata(){} //null body
    public void calc(){}
    public void display(){}
}

class circle extends shape
{
    private float rad;
    private float ar, pr;

    public void readdata()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter radius :");
        rad=scn.nextFloat();
    }
    public void calc()
    {
        ar=(float)(Math.PI*rad*rad);
        pr=(float)(2*Math.PI*rad);
    }
    public void display()
    {
        System.out.println("\n Arae = " + ar);
        System.out.println("\n Perimeter = " + pr);
    }
}

class rectangle extends shape
{
    private float l, b;
    private float ar, pr;

    public void readdata()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter length :");
        l=scn.nextFloat();
        System.out.println("\n Enter breadth :");
        b=scn.nextFloat();
    }
    public void calc()
    {
        ar=(l*b);
        pr=2*(l+b);
    }
    public void display()
    {
        System.out.println("\n Arae = " + ar);
        System.out.println("\n Perimeter = " + pr);
    }
}

public class inheritance6 {
    public static void main(String[] args) {
        circle c=new circle();
        c.setName("circle");
        System.out.println("\n Name : " + c.getName());
        c.readdata();
        c.calc();
        c.display();

        rectangle r=new rectangle();
        r.setName("rectangle");
        System.out.println("\n Name : " + r.getName());
        r.readdata();
        r.calc();
        r.display();
    }
}