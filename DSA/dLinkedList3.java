package DSA;

import java.util.Scanner;
public class dLinkedList3 {
    private static int cnt=0; //for number of nodes
    private static dlist frnt=null;
    private static dlist rear=null;
    public static void menu()
    {
        System.out.println("\n\t\t Main Menu");
        System.out.println("\n\t 1. Create a Doubly Linked List");
        System.out.println("\n\t 2. Traverse the Doubly Linked List");
        System.out.println("\n\t 3. Insert as a first node");
        System.out.println("\n\t 4. Insert as a last node");
        System.out.println("\n\t 5. Insert node at a defined position");
        System.out.println("\n\t 6. Delete first node");
        System.out.println("\n\t 7. Delete last node");
        System.out.println("\n\t 8. Delete node from a defined position");
        System.out.println("\n\t 9. Search a node");
        System.out.println("\n\t 10. Sort the DoublyLinked List");
        System.out.println("\n\t 11. Exit");
        System.out.println("\n\t Enter your choice (1-11) :");
    }
    public static void createlist()
    {
        Scanner scn=new Scanner(System.in);
        dlist node, newnode;
        char ch;
        node=new dlist();
        node.setPrev(null);
        frnt=node;
        do {
            ++cnt;
            System.out.println("\n Enter information part :");
            node.setInfo(scn.nextInt());
            node.setNext(null);
            rear=node;
            System.out.println("\n Do you want to continue (Y/N) :");
            ch=scn.next().charAt(0);
            if((ch=='Y')||(ch=='y'))
            {
                newnode=new dlist();
                node.setNext(newnode);
                newnode.setPrev(node);
                node=newnode;
                continue;
            }
            else
                break;
        }while(true);
    }
    public static void traverse()
    {
        dlist node;
        System.out.println("\n Number of nodes : " + cnt + "\n");
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Doubly Linked List is Empty");
        }
        else
        {
            try {
                System.out.println("\n Contents of Doubly Linked List Top to bottom \n");
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
    public static void insertfirst()
    {
        ++cnt;
        dlist newnode=new dlist();
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());
        //if doubly linked list is not created this shall be the first node
        if((frnt==null)&&(rear==null))
        {
            frnt=rear=newnode;
            newnode.setPrev(null);
            newnode.setNext(null);
        }
        else
        {
            dlist node=frnt;
            newnode.setPrev(node.getPrev());
            newnode.setNext(node);
            node.setPrev(newnode);
            frnt=newnode;
        }
    }
    public static void insertlast()
    {
        ++cnt;
        dlist newnode=new dlist();
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());
        //if doubly linked list is not created this shall be the first node
        if((frnt==null)&&(rear==null))
        {
            frnt=rear=newnode;
            newnode.setPrev(null);
            newnode.setNext(null);
        }
        else {
            //traverse to the last node
            dlist node=rear;
            //update the next reference
            newnode.setPrev(node);
            newnode.setNext(node.getNext());
            node.setNext(newnode);
            rear=newnode;
        }
    }
    public static void insposition()
    {
        dlist newnode=new dlist();
        Scanner scn=new Scanner(System.in);
        System.out.println("\n Enter information part :");
        newnode.setInfo(scn.nextInt());
        //if doubly linked list is not created this shall be the first node
        if((frnt==null)&&(rear==null))
        {
            frnt=rear=newnode;
            newnode.setPrev(null);
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
                    dlist node = frnt;
                    for (int i = 1; i < (pos-1); ++i)
                        node = node.getNext();
                    //update the nodes
                    newnode.setPrev(node);
                    newnode.setNext(node.getNext());
                    node.getNext().setPrev(newnode);
                    node.setNext(newnode);
                }
        }
    }
    public static void deletefirst()
    {
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Doubly Linked List Empty ....");
        }
        else
        if(frnt==rear)
        {
            frnt=rear=null;
        }
        else
        {
            --cnt;
            dlist node=frnt;
            node.getNext().setPrev(node.getPrev());
            frnt=node.getNext();
        }
    }
    public static void deleteLast()
    {
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Doubly Linked List Empty ....");
        }
        else
        if(frnt==rear)
        {
            frnt=rear=null;
        }
        else
        {
            --cnt;
            dlist prev, nxt;
            //we need to be at two places, last node and one previous
            prev=frnt;
            nxt=prev.getNext();
            while(nxt.getNext()!=null)
            {
                prev=prev.getNext();
                nxt=nxt.getNext();
            }
            dlist node=rear;
            node.getPrev().setNext(node.getNext());
            rear=node.getPrev();
        }
    }
    public static void delposition()
    {
        //if linked list is empty
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Doubly Linked List Empty ....");
        }
        else
        if(frnt==rear)
        {
            frnt=rear=null;
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
                    dlist prev, nxt;
                    //we need to be at two places, last node and one previous
                    prev=frnt;
                    nxt=prev.getNext();
                    for(int i=1; i<(pos-1); ++i)
                    {
                        prev=prev.getNext();
                        nxt=nxt.getNext();
                    }
                    --cnt;
                    //upadte the next fiels
                    nxt.getNext().setPrev(nxt.getPrev());
                    prev.setNext(nxt.getNext());
                }
        }
    }
    public static void searchlist()
    {
        //if linked list is empty, then no search
        if((frnt==null)&&(rear==null))
        {
            System.out.println("\n Doubly Linked List Empty ....");
        }
        else
        {
            int elem, flag=0;
            Scanner scn=new Scanner(System.in);
            System.out.println("\n Enter element to search :");
            elem=scn.nextInt();
            dlist node=frnt;
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

    public static void sort(){
        dlist newnode=frnt;
        dlist frm=frnt.getNext();
       while(frm.getNext()!=null){
           if(newnode.getInfo()>frm.getInfo()){
               int temp= frm.getInfo();
               frm.setInfo(newnode.getInfo());
               newnode.setInfo(temp);
               frm=frm.getNext();
           }
           else{
               continue;
           }
           newnode=newnode.getNext();
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
                case 10:
                    sort();
                    break;
            }
        }while(ch<11);
    }
}












