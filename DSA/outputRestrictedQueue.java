package DSA;

import java.util.Scanner;
//Output Restricted Queue, here we can insert element from both ends
//but can process element from front end only
public class outputRestrictedQueue {
    private static int cnt=0; //for number of nodes
    private static list frnt=null;
    private static list rear=null;

    public static  void menu()
    {
        System.out.println("\n\t\t Main Menu ");
        System.out.println("\n\t 1. Enqueue from front");
        System.out.println("\n\t 2. Enqueue from rear");
        System.out.println("\n\t 3. Dequeue"); //delete first
        System.out.println("\n\t 4. Display");
        System.out.println("\n\t 5. Peek");
        System.out.println("\n\t 6. Search");
        System.out.println("\n\t 7. Exit");
        System.out.println("\n\t Please enter your choice from 1 -6 :");
    }

    public static void enqueueRear()
    {
        Scanner scn=new Scanner(System.in);
        list newnode;
        newnode=new list();
        ++cnt;
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());

        //when queue is empty, this shall be the first node
        if((frnt==null)&&(rear==null))
        {
            frnt=rear=newnode;
        }
        else
        {
            list node=rear;
            newnode.setNext(node.getNext());
            node.setNext(newnode);
            rear=newnode;
        }
    }

    public static void enqueueFrnt()
    {
        Scanner scn=new Scanner(System.in);
        list newnode;
        newnode=new list();
        ++cnt;
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());

        //when queue is empty, this shall be the first node
        if((frnt==null)&&(rear==null))
        {
            frnt=rear=newnode;
        }
        else
        {
            //update the next part of the nodes
            list node=frnt;
            newnode.setNext(node);
            frnt=newnode;
        }
    }

    public static void display()
    {
        System.out.println("\n Number of nodes : " + cnt + "\n");
        //check for queue being empty
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Queue is Empty");
        }
        else
        {
            list node;
            try {
                System.out.println("\n Contents of Linked List \n");
                node = frnt;
                while (node != null) {
                    System.out.printf( "%5d" , node.getInfo());
                    node = node.getNext();
                }
            }
            catch(Exception ex)
            {}
        }
    }

    public static void dequeue()
    {
        //check for queue being empty
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Queue is Empty");
        }
        else
        if(frnt==rear) //this is the last node left
        {
            --cnt;
            frnt = rear = null; //queue becomes empty
        }
        else
        {
            --cnt;
            list node=frnt;
            frnt=node.getNext();
        }
    }

    public static void searchqueue()
    {
        //if queue is empty, then no search
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Queue is Empty");
        }
        else
        {
            int elem, flag=0;
            Scanner scn=new Scanner(System.in);
            System.out.println("\n Enter element to search :");
            elem=scn.nextInt();

            list node=frnt;
            int i=1;
            while(node!=null)
            {
                if(node.getInfo()==elem)
                {
                    flag=1;
                    break;
                }
                node=node.getNext();
                ++i;
            }
            if(flag==1)
            {
                System.out.println("\n Element occurs at " + i + " position");
            }
            else
                System.out.println("\n Element is not found in the list ...");
        }
    }

    public static void peek()
    {
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Queue is Empty");
        }
        else {
            System.out.println("\n Element at front : " + frnt.getInfo());
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int ch;

        do {
            menu();
            do {
                ch=scn.nextInt();
                if((ch<1)||(ch>7))
                {
                    System.out.println("\n Invalid choice ... try agian");
                    continue;
                }
                else
                    break;
            }while(true);

            switch(ch)
            {
                case 1:
                    enqueueFrnt();
                    break;
                case 2:
                    enqueueRear();
                    break;
                case 3:
                    dequeue();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    peek();
                    break;
                case 6:
                    searchqueue();
                    break;
            }
        }while(ch<7);
    }
}












