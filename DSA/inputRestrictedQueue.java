package DSA;

import java.util.Scanner;
//Input restricted queue and here we can insert only from
//rear end but process from both the ends

public class inputRestrictedQueue {
    private static int cnt=0; //for number of nodes
    private static list frnt=null;
    private static list rear=null;

    public static  void menu()
    {
        System.out.println("\n\t\t Main Menu ");
        System.out.println("\n\t 1. Enqueue"); //insert last
        System.out.println("\n\t 2. Dequeue from Front");
        System.out.println("\n\t 3. Dequeue from Rear");
        System.out.println("\n\t 4. Display");
        System.out.println("\n\t 5. Peek");
        System.out.println("\n\t 6. Search");
        System.out.println("\n\t 7. Exit");
        System.out.println("\n\t Please enter your choice from 1-7 :");
    }

    public static void enqueue()
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

    public static void dequeuefrnt()
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

    public static void dequeuerear()
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
            //traverse to the second last and last node to remove from rear end
            list prev=frnt;
            list nxt=prev.getNext();

            while(nxt.getNext()!=null)
            {
                prev=prev.getNext();
                nxt=nxt.getNext();
            }

            prev.setNext(nxt.getNext());
            rear=prev;
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
                    enqueue();
                    break;
                case 2:
                    dequeuefrnt();
                    break;
                case 3:
                    dequeuerear();
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