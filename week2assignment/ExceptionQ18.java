package week2assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }

}

public class ExceptionQ18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do Divison");
        float x,y,result;
        System.out.println("Enter Two x and Y Value for Divison");
        x=sc.nextFloat();
        y=sc.nextFloat();
        result=x/y;
        if(y==0){
            try{
                throw new MyException("Invalid Divison");
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Result ="+result);
        }
        //-----------------------------------------

        int arr[]={2,3,4,5,6};
        System.out.println("Enter Index for accesing value");

        try{
            int indx=sc.nextInt();
            if(indx>=arr.length){
                throw new MyException("Array out of index");
            }
            else{
                System.out.println(arr[indx]);
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Format Mismatch");
        }

        finally
        {
            System.out.println("Exception Handling Complete");
        }

    }
}
