package week2assignment;

import java.util.ArrayList;
import java.util.Collections;

/*Write a program to sort ArrayList in descending order?*/
public class Q7 {
    public static void main(String[] args){
        //+++++++++++++++++++++++++++++++++Q7+++++++++++++++++++++++++++++++++++++++++++++++++
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(100);
        arr.add(2);
        arr.add(30);
        arr.add(45);
        arr.add(52);
        arr.add(60);
        Collections.sort(arr, Collections.reverseOrder());

        for(Integer e:arr){
            System.out.print(e+" ");
        }

        //+++++++++++++++++++++++++++++++++Q7+++++++++++++++++++++++++++++++++++++++++++++++++

    }
}
