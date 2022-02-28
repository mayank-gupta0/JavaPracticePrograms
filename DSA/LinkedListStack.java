package DSA;

import java.util.Scanner;
public class LinkedListStack {
    private static int cnt=0; //for number of nodes
    private static list top=null;
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
    public static void push()
    {
        Scanner scn=new Scanner(System.in);
        list node, newnode;
        char ch;
        node=new list();
        top=node;
        do {
            ++cnt;
            System.out.println("\n Enter information part :");
            node.setInfo(scn.nextInt());
            node.setNext(null);
            System.out.println("\n Do you want to continue (Y/N) :");
            ch=scn.next().charAt(0);
            if((ch=='Y')||(ch=='y'))
            {
                newnode=new list();
                node.setNext(newnode);
                node=newnode;
                continue;
            }
            else
                break;
        }while(true);
    }
    public static void display()
    {
        System.out.println("\n Number of nodes : " + cnt + "\n");
        if(top==null)
        {
            System.out.println("\n Stack is Empty");
        }
        else
        {
            list node;
            try {
                System.out.println("\n Contents of Linked List \n");
                node = top;
                while (node != null) {
                    System.out.printf( "%5d" , node.getInfo());
                    node = node.getNext();
                }
            }
            catch(Exception ex)
            {}
        }
    }
    public static void peek() {
        System.out.println("\n Number of nodes : " + cnt + "\n");
        if (top == null) {
            System.out.println("\n Stack is Empty");
        } else {
            list node=top;
            System.out.println("\n Element at the top : " + node.getInfo());
        }
    }
    public static void pop()
    {
        if(top==null)
        {
            System.out.println("\n Stack is Empty ....");
        }
        else
        {
            --cnt;
            list node=top;
            top=node.getNext();
        }
    }
    public static void searchlist()
    {
        //if linked list is empty, then no search
        if(top==null)
        {
            System.out.println("\n Stack Empty ....");
        }
        else
        {
            int elem, flag=0;
            Scanner scn=new Scanner(System.in);
            System.out.println("\n Enter element to search :");
            elem=scn.nextInt();
            list node=top;
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
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int ch;
        do {
            menu();
            do {
                ch=scn.nextInt();
                if((ch<1)||(ch>11))
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
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    searchlist();
                    break;
            }
        }while(ch<6);
    }
}












