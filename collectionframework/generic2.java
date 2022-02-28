package collectionframework;

public class generic2 {
    public static void display(Object x, Object y)
    {
        System.out.println("\n x =" + x + "\t y = " + y);
    }

    public static void main(String[] args) {
        display(3,4);
        display(2.5f, 5.6f);
        display(1.2, 4.5);
        display("India", "Great");

        display(new Integer(3),new Integer(4));
        display(new Float(1.234f), new Float(5.678f));
        display(new Double(1.234), new Double(6.890));
        display(new String("India"), new String("Bhutan"));
    }
}
