package week2assignment;

/*Write a generic method to exchange the positions of two different elements in an array*/
public class Q2 {
    public static <T> void counti(T[] arr,int i,int j){
        System.out.println("Before Swaping");
        for(T e:arr){
            System.out.print(e+" ");
        }

        System.out.println();
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.println("After Swaping:");
        for(T e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        Integer[] arr={1,2};
        String[] arr1={"India","Jaipur"};
        counti(arr,0,1);
        counti(arr1,0,1);

    }
}
