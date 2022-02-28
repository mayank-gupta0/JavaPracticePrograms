package week2assignment;

import java.util.HashSet;
/* Write a program to convert HashSet to Array?*/
public class Q11 {
    public static void main(String[] args){

        //+++++++++++++++++Q11++++++++++++++++++++++++++++++++++++++++++++

        HashSet<Integer> h1=new HashSet<>();
        h1.add(12);
        h1.add(13);
        h1.add(1);
        h1.add(15);

        int si=h1.size();
        int[] arr=new int[si];
        int i=0;
        for(Integer e:h1){
            arr[i]=e;
            i++;
        }

        for(Integer e:arr){
            System.out.println("Array is "+e);
        }

//        //+++++++++++++++++Q11++++++++++++++++++++++++++++++++++++++++++++
    }

}
