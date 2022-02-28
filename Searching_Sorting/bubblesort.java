package Searching_Sorting;

import java.util.Scanner;

public class bubblesort {
    public static void bubbleSort(int[] arr)
    {
        int t;
        for(int i=0; i<arr.length; ++i)
        {
            for(int j=0; j<(arr.length-i-1); ++j)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int elem, pos;
        int[] arr=new int[10];
        System.out.println("\n Enter elements to the array \n");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println("\n arr["+i+"]=");
            arr[i]=scn.nextInt();
        }
        System.out.println("\n Before Sorting \n");
        for(int x : arr)
            System.out.printf("%5d", x);
        bubbleSort(arr);
        System.out.println("\n After Sorting \n");
        for(int x : arr)
            System.out.printf("%5d", x);
    }
}






