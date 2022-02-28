package ClassWork;

class clB4
{
    public void show()
    {
        System.out.println("\n this is show from clB4");
    }
}

class clB5 extends clB4
{
    //method show() here is overridden
    public void show()
    {
        super.show();
        System.out.println("\n this is show from clB5");
    }
}

public class super2 {
    public static void main(String[] args) {
        clB5 ob=new clB5();
        ob.show();
    }
}