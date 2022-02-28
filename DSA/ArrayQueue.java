package DSA;

import java.util.*;
import java.util.*;
public class ArrayQueue {
    private static int[] arr;
    private static int frnt;
    private static int rear;
    static
    {
        Scanner scn=new Scanner(System.in);
        arr=new int[100];
        //queue is empty
        frnt=-1;
        rear=-1;
    }
    public static void enqueue()
    {
        Scanner scn=new Scanner(System.in);
        //if queue is empty then insert as first element
        if((rear+1)>=arr.length)
        {
            System.out.println("\n Queue is full ");
        }
        else {
            if ((frnt == -1) && (rear == -1)) {
                frnt = rear = 0;
            } else {
                ++rear;
            }
            System.out.println("\n arr["+rear+"]=");
            arr[rear]=scn.nextInt();
        }
    }
    public static void display()
    {
        //check if array is empty
        if ((frnt == -1) && (rear == -1))
        {
            System.out.println("\n Queue is Empty ...");
        }
        else
            for(int i=frnt; i<=rear; ++i)
                System.out.printf("%5d", arr[i]);
    }
    public static void deque()
    {
        if ((frnt == -1) && (rear == -1))
        {
            System.out.println("\n Queue is Empty ...");
        }
        else
        if(frnt==rear)
        {
            //only one element is in the queue
            frnt=rear=-1;
        }
        else
        {
            //option 1 over write the right element to left
            for(int i=frnt; i<=rear; ++i)
                arr[i]=arr[i+1];
            --rear;
            //option2
            //since the rule is to process the first element
            //hence we can just increase frnt by 1
            //++frnt;
        }
    }
    public static void search()
    {
        Scanner scn=new Scanner(System.in);
        //check if array is empty or not
        if ((frnt == -1) && (rear == -1))
        {
            System.out.println("\n Queue is Empty ...");
        }
        else
        {
            int elem, flag=0, i;
            System.out.println("\n Enter element to search : ");
            elem=scn.nextInt();
            for(i=frnt; i<=rear; ++i)
            {
                if(arr[i]==elem)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("\n" + elem + " found at " + (i+1) + " Position");
            else
                System.out.println("\n Element not found");
        }
    }
    public static void peek()
    {
        if ((frnt == -1) && (rear == -1))
        {
            System.out.println("\n Queue is Empty ...");
        }
        else
        {
            System.out.println("\n Element at the front : " + arr[frnt]);
        }
    }
    public static  void menu()
    {
        System.out.println("\n\t\t Main Menu ");
        System.out.println("\n\t 1. Enqueue");
        System.out.println("\n\t 2. Dequeue");
        System.out.println("\n\t 3. Display");
        System.out.println("\n\t 4. Peek");
        System.out.println("\n\t 5. Search");
        System.out.println("\n\t 6. Exit");
        System.out.println("\n\t Please enter your choice from 1 -6 :");
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
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
                    enqueue();
                    break;
                case 2:
                    deque();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    search();
                    break;
            }
        }while(ch<6);
    }
}












