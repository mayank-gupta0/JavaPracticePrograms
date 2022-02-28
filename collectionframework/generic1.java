package collectionframework;

public class generic1 {
    public static void display(int x, int y)
    {
        System.out.println("\n x = " + x + "\t y = " + y);
    }
    public static void display(float x, float y)
    {
        System.out.println("\n x = " + x + "\t y = " + y);
    }
    public static void display(double x, double y)
    {
        System.out.println("\n x = " + x + "\t y = " + y);
    }
    public static void main(String[] args) {
        display(5,6);
        display(5.5f,6.2f);
        display(4.4,2.3);
    }
}
