package java8newfeatures;

@FunctionalInterface
interface inf100
{
    void display(); ///abstract method
    default void show() //default method non-abstract
    {
        System.out.println("\n This is show() method from interface");
    }
}
class cl800 implements inf100
{
    @Override
    public void display()
    {
        System.out.println("\n this id from cl800 class");
    }
}
class cl801 implements inf100
{
    @Override
    public void display()
    {
        System.out.println("\n this id from cl801 class");
    }

    public void show()
    {
        System.out.println("\n This is a show method");
    }
}
public class funcinter1 {
    public static void main(String[] args) {
        cl800 ob1=new cl800();
        cl801 ob2=new cl801();

        ob1.display(); //call the overridden method
        ob1.show(); //calling the default method

        ob2.display();//call the overridden method
        ob2.show();//call the overridden method
    }
}
