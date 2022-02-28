package DSA;

import java.util.*;
public class circularQueue {
    private static int[] arr;
    private static int sz;
    private static int frnt;
    private static int rear;

    static{
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Please eneter the size of the array to create:");
        sz=scn.nextInt();
        arr=new int[sz];
        //queue is empty
        frnt=-1;
        rear=-1;
    }

    public static void enqueue()
    {
        Scanner scn=new Scanner(System.in);
        if((frnt==0)&&(rear==(arr.length-1)))
        {
            System.out.println("\n Queue is Full");
        }
        else
        if((rear<frnt)&&((frnt-rear)==1))
        {
            System.out.println("\n Queue is Full");
        }
        else
        {
            if ((frnt == -1) && (rear == -1)) {
                frnt = rear = 0;
            } else if ((frnt > 0) && (rear == (arr.length - 1))) {
                rear = 0;
            } else
                ++rear;
            System.out.println("\n Enter element : ");
            arr[rear] = scn.nextInt();
        }
    }

    public static void dequeue()
    {
        if ((frnt == -1) && (rear == -1))
        {
            System.out.println("\n Array or Queue is Empty");
        }
        else
        if(frnt==rear)
        {
            //last element, now array is empty
            frnt=rear=-1;
        }
        else
        if((rear>0)&&(frnt==(arr.length-1)))
        {
            frnt=0;
        }
        else
            ++frnt;
    }

    public static void display()
    {
        if((frnt==-1)&&(rear==-1))
        {
            System.out.println("\n Array or Queue is Empty");
        }
        else
        if(frnt<=rear)
        {
            for(int i=frnt; i<=rear; ++i)
                System.out.printf("%5d", arr[i]);
        }
        else
        if(frnt> rear)
        {
            for(int i=frnt; i<arr.length; ++i)
                System.out.printf("%5d", arr[i]);
            System.out.printf("%5c", '|');
            for(int i=0; i<=rear; ++i)
                System.out.printf("%5d", arr[i]);
        }
    }

    public static void menu()
    {
        System.out.println("\n \t\t\t Circular Queue Menu");
        {
            System.out.println("\n\t\t 1. Enqueue");
            System.out.println("\n\t\t 2. Dequeue");
            System.out.println("\n\t\t 3. Display");
            System.out.println("\n\t\t 4. Exit");
            System.out.println("\n\t\t Please enter your choice (1-4) :");
        }
    }
    public static void main(String[] args) {
        int ch;
        Scanner scn=new Scanner(System.in);
        do {
            do{
                menu();
                ch=scn.nextInt();
                if((ch<1)||(ch>4))
                {
                    System.out.println("\n Invalid choice ... try again");
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
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
            }
        }while(ch<4);
    }
}








