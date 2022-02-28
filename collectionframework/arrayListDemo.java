package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<String> al2=new ArrayList<String>();
        ArrayList<Integer> al3=new ArrayList<Integer>();

        al1.add(10);
        al1.add(20);
        al1.add(30);

        System.out.println("\n ArrayList of Integer ");

        Iterator itr=al1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        al2.add("Lucknow");
        al2.add("New Delhi");
        al2.add("Jaipur");

        System.out.println("\n ArrayList of String ");
        itr=al2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        al3.add(111);
        al3.add(222);

        al3.addAll(al1);
        System.out.println("\n ArrayList of Integer ");
        itr=al3.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        al3.addAll(2, al1);
        System.out.println("\n ArrayList of Integer ");
        itr=al3.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

//        System.out.println("\n Object array \n");
//        Object[] arr=al3.toArray();
//        for(Object o : arr)
//            System.out.println(o);

//        Integer[] arr2=new Integer[al3.size()];
//        al3.toArray(arr2);
//        System.out.println("interger array");
//        for(Integer o: arr2){
//            System.out.println(o);
//        }

        System.out.println("\n forward only");
        ListIterator litr= al3.listIterator();
        while(litr.hasNext())
            System.out.println(litr.next());
        System.out.println("\n Reverse way");
        litr= al3.listIterator(al3.size());
        while(litr.hasPrevious())
            System.out.println(litr.previous());



    }
}









