package collectionframework;

import java.util.*;

//use wild card(?) , when you donot know what shall be the type
public class generic9 {
    public static void sumelements(List<? extends Number> lst )
    {
        double sum=0;
        for(Number x : lst)
            sum += x.doubleValue();
        System.out.println("\n Sum of elements : " + sum);
    }
    public static void main(String[] args) {
        List<Integer> lst1=new ArrayList<>();
        lst1.add(10);
        lst1.add(20);
        lst1.add(30);
        sumelements(lst1);
        List<Double> lst2=new ArrayList<>();
        lst2.add(10.5);
        lst2.add(20.5);
        lst2.add(30.5);
        sumelements(lst2);
        List<String> lst3=new ArrayList<>();
        lst3.add("abc");
        lst3.add("def");
        lst3.add("ghi");
        // sumelements(lst3); error as we have extended wild card to Numbertype



    }
}
