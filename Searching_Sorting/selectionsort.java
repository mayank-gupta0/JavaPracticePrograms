package Searching_Sorting;

import java.util.Scanner;

public class selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
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

        selectionsort(arr);

        System.out.println("\n After Sorting \n");

        for(int x : arr)
            System.out.printf("%5d", x);
    }
}
