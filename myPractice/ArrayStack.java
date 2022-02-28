package myPractice;

import java.util.*;
class Stack{
    public static int top=-1;
    public static int arr[]=new int[100];
//--------------------------------------------------------------
    public static void push(){
        if(top+1>=arr.length){
            System.out.println("Stack Overflow");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Element");
            top++;
            arr[top]=sc.nextInt();
        }
    }
    //-------------------------------------------------------------------
    public static void peek(){
        if(top==-1){
            System.out.println("No elm in array");
        }
        else{
            System.out.println("TopMost Elm is :"+arr[top]);
        }
    }

//--------------------------------------------------------------------------
    public static void pop(){
        if(top==-1){
            System.out.println("No elm to pop");
        }
        else{
            top--;
        }

    }

    //-------------------------------------------------------------------

    public static void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}


//--------------------------------------------------------------------------
public class ArrayStack {
    public static void menu()
    {
        System.out.println("\n\t\t Main Menu ");
        System.out.println("\n\t 1. Push");
        System.out.println("\n\t 2. Pop");
        System.out.println("\n\t 3. Peek");
        System.out.println("\n\t 4. Display");
        System.out.println("\n\t 5. Search");
        System.out.println("\n\t 6. Exit");
        System.out.println("\n\t Please enter your choice from 1 -6 :");
    }
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        Stack ob=new Stack();
        int ch;
        do {
            do {
                menu();
                ch=scn.nextInt();
                if((ch<1)||(ch>6))
                {
                    System.out.println("\n Invalid choice .... try again");
                    continue;
                }
                else
                    break;
            }while(true);
            switch(ch)
            {
                case 1:
                    ob.push();
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.peek();
                    break;
                case 4:
                    ob.display();
                    break;
//                case 5:
//                    ob.search();
//                    break;
            }
        }while(ch<6);
    }
}
