package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class arrayListDemo2 {
    public static void main(String[] args) {
        //non-generic array list
        ArrayList al1=new ArrayList();

        al1.add(10);
        al1.add(20);
        al1.add("India");
        al1.add(true);

        Iterator itr=al1.iterator();
        while(itr.hasNext())
            System.out.println("\n " + itr.next());

        System.out.println("===========================");
        for(Object o : al1)
            System.out.println("\n" + o);

        System.out.println("===========================");
        for(int i=0; i<al1.size(); ++i)
            System.out.println(al1.get(i));

        //Generic array List

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(5);
        al2.add(1);
        al2.add(9);
        al2.add(7);
        al2.add(2);
        al2.add(11);
        al2.add(3);
        al2.add(4);
        al2.add(22);
        al2.add(8);

        System.out.println("\n List contents");
        itr=al2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        Collections.sort(al2);
        System.out.println("\n List contents after sorting");
        itr=al2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        Collections.reverse(al2);
        System.out.println("\n List contents in reverse order");
        itr=al2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}

