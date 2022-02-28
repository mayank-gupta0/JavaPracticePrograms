package collectionframework;

class cl500
{
    private Object a;
    private Object b;

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }
}
public class generic3 {
    public static void main(String[] args) {
        cl500 ob=new cl500();
        ob.setA(123);
        ob.setB("India");
        System.out.println(ob.getA());
        System.out.println(ob.getB());

        ob.setA(123.678f);
        ob.setB(true);
        System.out.println(ob.getA());
        System.out.println(ob.getB());
    }
}
