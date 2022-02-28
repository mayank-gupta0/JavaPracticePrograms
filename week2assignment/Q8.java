package week2assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*Write a program to add element at particular index of ArrayList?*/
public class Q8 {
    public static void main(String[] args){
        //+++++++++++++++++++++++++++++++++Q8+++++++++++++++++++++++++++++++++++++++++++++++++

        ArrayList<Integer> newarr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        newarr.add(2);
        newarr.add(3);
        newarr.add(4);
        newarr.add(5);
        System.out.println();
        System.out.println("Original Array");
        for(Integer e:newarr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Enter index at you want to add elm");
        int n=sc.nextInt();
        System.out.println("Enter elm which you want to add");
        int elm=sc.nextInt();
        newarr.add(n,elm);

        for(Integer e:newarr){
            System.out.print(e+" ");
        }

        //+++++++++++++++++++++++++++++++++Q8+++++++++++++++++++++++++++++++++++++++++++++++++
    }
}
