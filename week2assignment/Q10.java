package week2assignment;

import java.util.*;
/*Write a program to convert LinkedList to ArrayList?*/

public class Q10 {
    public static void main(String[] args){

//        ++++++++++++++++++++++++++Q10+++++++++++++++++++++++++++++++++++
        LinkedList<Integer> ar1=new LinkedList<Integer>();
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);

        ArrayList<Integer> ar2=new ArrayList<>(ar1);
        for(Integer e:ar2){
            System.out.println(e);

        }
//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        }
    }

