package collectionframework;

class cl501<T>
{
    private T a;
    private T b;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }
}
public class generic4 {
    public static void main(String[] args) {
        cl501<Integer> ob1=new cl501<>();
        cl501<Float> ob2=new cl501<>();
        cl501<Double> ob3=new cl501<>();
        cl501<String> ob4=new cl501<>();

        ob1.setA(123);
        ob1.setB(456);
        System.out.println("\n Object1");
        System.out.println(ob1.getA());
        System.out.println(ob1.getB());

        ob2.setA(1.23f);
        ob2.setB(45.6f);
        System.out.println("\n Object2");
        System.out.println(ob2.getA());
        System.out.println(ob2.getB());

        ob3.setA(1.567);
        ob3.setB(4.89);
        System.out.println("\n Object3");
        System.out.println(ob3.getA());
        System.out.println(ob3.getB());

        ob4.setA("India");
        ob4.setB("Bhutan");
        System.out.println("\n Object4");
        System.out.println(ob4.getA());
        System.out.println(ob4.getB());
    }
}
