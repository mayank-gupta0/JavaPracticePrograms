package DSA;

import java.util.*;

class stack1 {
    private int[] arr;
    private int top;
    public stack1() {
        arr = new int[100];
        top = -1;
    }

    public void push() {
        if ((top + 1) >= arr.length) {
            System.out.println("\n Stack Overlow");
        } else {
            ++top;
            Scanner scn = new Scanner(System.in);
            System.out.printf("\n arr[%d]=", top);
            arr[top] = scn.nextInt();
        }
    }
    public void display() {
        //check if array is empty
        if (top == -1) {
            System.out.println("\n Array Empty ...");
        } else
            for (int i = top; i >= 0; --i)
                System.out.printf("%5d", arr[i]);
    }
    public void peek() {
        //check if array is empty
        if (top == -1) {
            System.out.println("\n Array Empty ...");
        } else
            System.out.println("Element at the top :" + arr[top]);
    }
    public void pop() {
        //array is empty or not
        if (top == -1) {
            System.out.println("\n Stack is Empty ...");
        } else {
            --top;
        }
    }
    public void search() {
        Scanner scn = new Scanner(System.in);
        //check if stack is empty or not
        if (top == -1) {
            System.out.println("\n Stack is empty");
        } else {
            int elem, flag = 0, i;
            System.out.println("\n Enter element to search : ");
            elem = scn.nextInt();
            for (i = top; i >= 0; --i) {
                if (arr[i] == elem) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("\n" + elem + " found at " + (i + 1) + " Position");
            else
                System.out.println("\n Element not found");
        }
    }
}
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
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        stack1 ob=new stack1();
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
                case 5:
                    ob.search();
                    break;
            }
        }while(ch<6);
    }
}











