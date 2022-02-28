package Searching_Sorting;

import java.util.Scanner;
public class binarysearch {
    public static int binarySearch(int[] arr, int elem)
    {
        int t;
        //first sort the array here bubble sort
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int x : arr)
            System.out.printf("%5d", x);
        //now search the element

        int l=0, mid, flag=0;
        int h=(arr.length-1);
        do {
            mid=(l+h)/2;
            if(arr[mid]==elem)
            {
                flag=1;
                break;
            }
            else
            if(elem>arr[mid])
                l=mid+1;
            else
                h=mid-1;
        }while(l<=h);
        if(flag==1)
            return(mid);
        else
            return(-1);
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
        System.out.println("\n Enter element to search :");
        elem=scn.nextInt();
        pos=binarySearch(arr,elem);
        if(pos==-1)
            System.out.println("\n Element does not exist");
        else
            System.out.println("\n Element exist at " + (pos) + " of the array");
    }
}










