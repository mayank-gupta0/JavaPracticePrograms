package collectionframework;

import java.util.Iterator;
import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>();

        System.out.println("\n Initial capacity of vector : " + vec.capacity());
        for(int i=1; i<=15; ++i)
            vec.add("Java " + i);
        System.out.println("\n Initial capacity of vector : " + vec.capacity());

        Iterator itr=vec.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
