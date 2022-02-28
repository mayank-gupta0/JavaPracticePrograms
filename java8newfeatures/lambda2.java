package java8newfeatures;
import java.util.ArrayList;
import java.util.List;

public class lambda2 {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<String>();
        lst.add("India");
        lst.add("Nepal");
        lst.add("Bhutan");
        lst.add("Srilanka");
        lst.add("Maldives");

        lst.forEach((x)->System.out.println(x));
    }
}
