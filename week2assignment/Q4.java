package week2assignment;

import java.util.*;
/*Write a program to iterate the HashMap ?*/
public class Q4 {
    public static void main(String[] args){
        HashMap<String,Integer> ar=new HashMap<>();
        ar.put("Rajasthan",5);
        ar.put("Pune",4);
        ar.put("Mumbai",3);
        ar.put("Jaipur",1);
        ar.put("Delhi",2);

        /*entrySet: It is a set of key value pair in the Map.*/
        Set s=ar.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = s.iterator();

        while(itr.hasNext())
        {
            Map.Entry<String,Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


    }
}
