package ClassWork;

abstract class abs1{
    public abstract void display();
    public static void dis(){
        System.out.println("Inside in abstract class");
    }
}
class cl1 extends abs1{
    public void display(){
        System.out.println("this is implemnt in cl1");
    }
}
class cl2 extends abs1{
    public void display(){
        System.out.println("this is implemnt in cl2");
    }
}
public class abstract1 {
    public static void main(String[] args) {

        cl1 o1 = new cl1();
        cl2 o2 = new cl2();
        // s1 ab=new abs1();  // we can not create object of abstract ass
        o1.display();
        o2.display();
        abs1.dis();
    }
}