package week2assignment;

import java.util.ArrayList;
import java.util.Scanner;
/*Write a program to remove element from specified index of ArrayList?*/

public class Q9 {
    public static void main(String[] args){


        ArrayList<Integer> newarr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        newarr.add(2);
        newarr.add(3);
        newarr.add(4);
        newarr.add(5);

        System.out.println();
        System.out.println("Enter Index To Remove Specific Elms");
        int sp=sc.nextInt();
        if(sp<=newarr.size()){
            newarr.remove(sp);
            System.out.println("New Array after removing");

            for(Integer e:newarr){
                System.out.print(e+" ");
            }

        }
        else{
            System.out.println("Index is invalid");
        }

        //+++++++++++++++++++++++++++++++++Q9+++++++++++++++++++++++++++++++++++++++++++++++++



    }
}
