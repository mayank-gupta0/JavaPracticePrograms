package collectionframework;

class cl502<T1, T2>
{
    private T1 a;
    private T2 b;

    public T1 getA() {
        return a;
    }

    public void setA(T1 a) {
        this.a = a;
    }

    public T2 getB() {
        return b;
    }

    public void setB(T2 b) {
        this.b = b;
    }
}
public class generic5 {
    public static void main(String[] args) {
        cl502<Integer,Integer> ob1=new cl502<Integer,Integer>();
        cl502<Float, Float> ob2=new cl502<>();
        cl502<Double, Double> ob3=new cl502<>();
        cl502<String, String> ob4=new cl502<>();

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

        cl502<Integer,Float> ob5=new cl502<>();
        cl502<Float, Double> ob6=new cl502<>();
        cl502<Double, Boolean> ob7=new cl502<>();
        cl502<String, Integer> ob8=new cl502<>();

        ob5.setA(123);
        ob5.setB(1.23f);
        System.out.println("\n Object5");
        System.out.println(ob5.getA());
        System.out.println(ob5.getB());

        ob6.setA(1.23f);
        ob6.setB(456.789);
        System.out.println("\n Object6");
        System.out.println(ob6.getA());
        System.out.println(ob6.getB());

        ob7.setA(1.567);
        ob7.setB(true);
        System.out.println("\n Object7");
        System.out.println(ob7.getA());
        System.out.println(ob7.getB());

        ob8.setA("India");
        ob8.setB(123);
        System.out.println("\n Object8");
        System.out.println(ob8.getA());
        System.out.println(ob8.getB());
    }
}
