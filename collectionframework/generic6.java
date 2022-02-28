package collectionframework;

import java.util.Scanner;
//generic type methods
public class generic6 {
    //count number of time x occurs in an array
    public static <T> void cntitems(T[] arr, T x)
    {
        int cnt=0;
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].equals(x))
                ++cnt;
        }
        System.out.println("\n Number of times " + x + " occurs in array : " + cnt);

    }
    public static void main(String[] args) {
        Integer[] iarr={1,2,3,3,3,4,5,3};
        Double[] darr={1.2, 1.5, 2.5, 3.5, 1.2};
        String[] sarr={"India", "Bhutan", "Nepal", "Maldives", "India"};
        cntitems(iarr, 2);
        cntitems(darr, 1.2);
        cntitems(sarr, "India");
    }
}











