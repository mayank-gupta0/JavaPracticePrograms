package Searching_Sorting;

import java.util.Scanner;
public class insertionsort {
    public static void insertionSort(int[] arr)
    {
        int i, j, temp;
        for(i=1; i<arr.length; ++i)
        {
            temp=arr[i];
            j=i-1;
            while((j>=0) &&(temp<arr[j]))
            {
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int elem, pos;
        int[] arr=new int[6];
        System.out.println("\n Enter elements to the array \n");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println("\n arr["+i+"]=");
            arr[i]=scn.nextInt();
        }
        System.out.println("\n Before Sorting \n");
        for(int x : arr)
            System.out.printf("%5d", x);

            insertionSort(arr);

        System.out.println("\n After Sorting \n");
        for(int x : arr)
            System.out.printf("%5d", x);
    }
}








