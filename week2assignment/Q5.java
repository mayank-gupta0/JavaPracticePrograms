package week2assignment;

import java.util.*;
/*. Write a program to sort HashMap by keys ?*/
public class Q5 {
    public static void main(String[] args){
        //+++++++++++++++++++++++++++++++++++++++++Q5+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        HashMap<String,Integer> ar=new HashMap<>();
        ar.put("Rajasthan",5);
        ar.put("Pune",4);
        ar.put("Mumbai",3);
        ar.put("Jaipur",1);
        ar.put("Delhi",2);

        List<Map.Entry<String,Integer>> kys=new ArrayList<>(ar.entrySet());

        Collections.sort(kys, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        System.out.println("After Sorting");
        for(Map.Entry<String, Integer> e:kys){
            System.out.println("Key="+e.getKey()+" Value="+e.getValue());
        }

        //+++++++++++++++++++++++++++++++++++++++++Q5+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }
}
