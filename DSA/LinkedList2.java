package DSA;
import java.util.*;

class list1
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

public class LinkedList2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        list start, node, newnode;
        char ch;

        node=new list();
        start=node;
        do {
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













