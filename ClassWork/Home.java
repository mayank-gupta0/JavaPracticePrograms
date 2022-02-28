package ClassWork;
import java.util.Scanner;

public class Home {
    public static void main(String [] args){
        System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();

//        System.out.println("Enter Value for Search");
//        int k=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter Values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//-------Value finding-------------------------
//        for(int i=0;i<n;i++){
//            if(arr[i]==k){
//                System.out.println("Your Value is Find "+arr[i]);
//                break;
//            }
//            else{
//                continue;
//            }
//        }
        System.out.println("original Array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        /*--------------Updating Array
        System.out.println("Which Value you want to put at first index");
        int firstIndex=sc.nextInt();

        System.out.println("Which value you want to insert at last index");
        int lastIndex= sc.nextInt();

        for(int i=0;i<n;i++){  // updating array
            if(i==0){
                arr[i]=firstIndex;
            }
            else if(i==n-1){
                arr[i]=lastIndex;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Updated Array is "+arr[i]);
        }
        */

        //----Ascending and descending of array is:
        System.out.println("");
        System.out.println("Ascending Array is");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    continue;
                }
                else{
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //---- Descending Array is
        System.out.println("");
        System.out.println("Descending Array is");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    continue;
                }
                else{
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
