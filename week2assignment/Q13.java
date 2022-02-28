package week2assignment;

import java.util.*;
/*Write a program to iterate TreeMap in java?*/
public class Q13 {
    public static void main(String[] args){

        //+++++++++++++++++Q13++++++++++++++++++++++++++++++++++++++++++++
//
        TreeMap<Integer,String> tr=new TreeMap<>();
        tr.put(5,"Bombay");
        tr.put(1,"India");
        tr.put(2,"Delhi");
        tr.put(3,"Jaipur");
        tr.put(4,"Kota");
        tr.put(6,"America");

        System.out.println("Sorted by keys");
        Iterator<Map.Entry<Integer,String>> it1=tr.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<Integer,String> entry=it1.next();
            System.out.println("Keys: "+entry.getKey()+" Value: "+entry.getValue());
        }

        Set<Map.Entry<Integer, String>> ent = tr.entrySet();  // entrySet returns a set having same elements as the hash map

        List<Map.Entry<Integer, String>> lst=new ArrayList<>(ent);
        Collections.sort(lst, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Sorted by value");
        for(Map.Entry<Integer, String> e:lst){
            System.out.println("Key="+e.getKey()+" Value="+e.getValue());
        }
////+++++++++++++++++Q13++++++++++++++++++++++++++++++++++++++++++++

    }
}
