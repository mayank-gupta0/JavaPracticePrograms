package week2assignment;

import java.util.ArrayList;
/*Write a program to reverse ArrayList in java?*/

public class Q12 {
    public static void main(String[] args) {
        //+++++++++++++++++Q12++++++++++++++++++++++++++++++++++++++++++++
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(12);
        ar1.add(13);
        ar1.add(14);
        ar1.add(15);

        System.out.println("Reverse Array list is ");
        for (int k = ar1.size() - 1; k >= 0; k--) {
            System.out.print(ar1.get(k) + " ");
        }
    }
}