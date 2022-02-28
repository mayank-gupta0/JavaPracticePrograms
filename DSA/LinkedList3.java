package DSA;

import java.util.Scanner;

class list2
{
    private int info;
    private list next;

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setNext(list next) {
        this.next = next;
    }

    public list getNext() {
        return next;
    }

}




public class LinkedList3 {
    private static int cnt=0; //for number of nodes
    private static list start=null;
    public static void menu()
    {
        System.out.println("\n\t\t Main Menu");
        System.out.println("\n\t 1. Create a Linked List");
        System.out.println("\n\t 2. Traverse the Linked List");
        System.out.println("\n\t 3. Insert as a first node");
        System.out.println("\n\t 4. Insert as a last node");
        System.out.println("\n\t 5. Insert node at a defined position");
        System.out.println("\n\t 6. Delete first node");
        System.out.println("\n\t 7. Delete last node");
        System.out.println("\n\t 8. Delete node from a defined position");
        System.out.println("\n\t 9. Search a node");
        System.out.println("\n\t 10. Sort the Linked List");
        System.out.println("\n\t 11. Exit");
        System.out.println("\n\t Enter your choice (1-11) :");
    }
    public static void createlist()
    {
        Scanner scn=new Scanner(System.in);
        list node, newnode;
        char ch;
        node=new list();
        start=node;
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
    public static void traverse()
    {
        System.out.println("\n Number of nodes : " + cnt + "\n");
        if(start==null)
        {
            System.out.println("\n Linked List is Empty");
        }
        else
        {
            list node;
            try {
                System.out.println("\n Contents of Linked List \n");
                node = start;
                while (node != null) {
                    System.out.printf( "%5d" , node.getInfo());
                    node = node.getNext();
                }
            }
            catch(Exception ex)
            {}
        }
    }
    public static void insertfirst()
    {
        ++cnt;
        list newnode=new list();
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());
        //if linked list is not created this shall be the first node
        if(start==null)
        {
            start=newnode;
            newnode.setNext(null);
        }
        else
        {
            newnode.setNext(start);
            start=newnode;
        }
    }
    public static void insertlast()
    {
        ++cnt;
        list newnode=new list();
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());
        //if linked list is not created this shall be the first node
        if(start==null)
        {
            start=newnode;
            newnode.setNext(null);
        }
        else {
            //traverse to the last node
            list node=start;
            while(node.getNext()!=null)
                node=node.getNext();
            //update the next reference
            newnode.setNext(node.getNext());
            node.setNext(newnode);
        }
    }
    public static void insposition()
    {
        list newnode=new list();
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());
        //if linked list is not created this shall be the first node
        if(start==null)
        {
            ++cnt;
            start=newnode;
            newnode.setNext(null);
        }
        else {
            //enter the position to insert node
            int pos;
            do {
                System.out.println("\n Enter the position to insert to :(1-" + cnt + ":");
                pos = scn.nextInt();
                //validate the position
                if ((pos < 1) || (pos > cnt)) {
                    System.out.println("\n Invalid Position ... try again");
                    continue;
                }
                else
                    break;
            }while(true);
            //if position is 1 call insertfirst
            if(pos==1)
                insertfirst();
            else
                //if position is equal to cnt inslast
                if(pos==cnt)
                    insertlast();
                else {
                    //traverse to reach to tha position before the specified position
                    ++cnt;
                    list node = start;
                    for (int i = 1; i < (pos-1); ++i)
                        node = node.getNext();
                    //update the nodes
                    newnode.setNext(node.getNext());
                    node.setNext(newnode);
                }
        }
    }
    public static void deletefirst()
    {
        if(start==null)
        {
            System.out.println("\n Linked List Empty ....");
        }
        else
        {
            --cnt;
            list node=start;
            start=node.getNext();
        }
    }
    public static void deleteLast()
    {
        if(start==null)
        {
            System.out.println("\n Linked List Empty ....");
        }
        else
        {
            --cnt;
            list prev, nxt;
            //we need to be at two places, last node and one previous
            prev=start;
            nxt=prev.getNext();
            while(nxt.getNext()!=null)
            {
                prev=prev.getNext();
                nxt=nxt.getNext();
            }
            //upadte the next fiels
            prev.setNext(nxt.getNext());
        }
    }
    public static void delposition()
    {
        //if linked list is empty
        if(start==null)
        {
            System.out.println("\n Linked List Empty ....");
        }
        else
        {
            Scanner scn=new Scanner(System.in);
            //enter the position to insert node
            int pos;
            do {
                System.out.println("\n Enter the position to insert to :(1-" + cnt + ":");
                pos = scn.nextInt();
                //validate the position
                if ((pos < 1) || (pos > cnt)) {
                    System.out.println("\n Invalid Position ... try again");
                    continue;
                }
                else
                    break;
            }while(true);
            //if position is 1 call insertfirst
            if(pos==1)
                deletefirst();
            else
                //if position is equal to cnt inslast
                if(pos==cnt)
                    deleteLast();
                else {
                    list prev, nxt;
                    //we need to be at two places, last node and one previous
                    prev=start;
                    nxt=prev.getNext();
                    for(int i=1; i<(pos-1); ++i)
                    {
                        prev=prev.getNext();
                        nxt=nxt.getNext();
                    }
                    --cnt;
                    //upadte the next fiels
                    prev.setNext(nxt.getNext());
                }
        }
    }
    public static void searchlist()
    {
        //if linked list is empty, then no search
        if(start==null)
        {
            System.out.println("\n Linked List Empty ....");
        }
        else
        {
            int elem, flag=0;
            Scanner scn=new Scanner(System.in);
            System.out.println("\n Enter element to search :");
            elem=scn.nextInt();
            list node=start;
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
                    createlist();
                    break;
                case 2:
                    traverse();
                    break;
                case 3:
                    insertfirst();
                    break;
                case 4:
                    insertlast();
                    break;
                case 5:
                    insposition();
                    break;
                case 6:
                    deletefirst();
                    break;
                case 7:
                    deleteLast();
                    break;
                case 8:
                    delposition();
                    break;
                case 9:
                    searchlist();
                    break;
            }
        }while(ch<11);
    }
}












