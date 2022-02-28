package week2assignment;
import java.util.*;
import java.util.stream.Stream;

/*Write a program to sort HashMap by value?*/
public class Q14 {
    public static void main(String[] args){

        //+++++++++++++++++Q14++++++++++++++++++++++++++++++++++++++++++++
        HashMap<Integer,String> h11=new HashMap<>();
        h11.put(1,"India");
        h11.put(2,"Delhi");
        h11.put(3,"Jaipur");
        h11.put(4,"Kota");
        h11.put(5,"Bombay");


        System.out.println("Original HasMap:");
        Iterator<Map.Entry<Integer,String>> it11=h11.entrySet().iterator();
        while(it11.hasNext()){
            Map.Entry<Integer,String> entry=it11.next();
            System.out.println(" Value: "+entry.getValue());
        }

        List<Map.Entry<Integer, String>> lst=new ArrayList<>(h11.entrySet());
        Collections.sort(lst, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("--------------------------------");
        for(Map.Entry<Integer, String> e:lst){
            System.out.println("Key="+e.getKey()+" Value="+e.getValue());

        }
    }
}
