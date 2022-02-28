package myPractice;
import java.util.*;

/*SINGEL LINKD LIST----------------------------------------------------------------------------------------------*/
/*
class Node{
    public int data;
    public Node next;

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

public class Sample {
    public static Node head=null;
    public static Node ptr,node;

    //-----------------------------------------------------------

    public static void menu()
    {
        System.out.println("\n\t\t Main Menu");
        System.out.println("\n\t 1. Create a Linked List");
        System.out.println("\n\t 2. Traverse the Linked List");
        System.out.println("\n\t 3. Insert as a first node");
        System.out.println("\n\t 4. Insert as a last node");
        System.out.println("\n\t 5. Insert as a Position");

    }
    //-------------------------------------------------------------------------

    public static void createlist(){
        Scanner sc=new Scanner(System.in);
        Node newNode;
        node=new Node();
        head=node;
        ptr=head;
        do{
            System.out.println("Enter Information");
            node.setData(sc.nextInt());
            node.setNext(null);

            System.out.println("Do you want to continue");
            char ch=sc.next().charAt(0);

            if(ch=='y'){
                newNode=new Node();
                node.setNext(newNode);
                node=newNode;
                continue;
            }
            else{
                break;
            }
        }while(true);

    }
    //------------------------------------------------------------------------------------------

    public static void traversing(){
        ptr=head;
        if(head==null){
            System.out.println("Linke List is Empty");
        }
        else{
            while(ptr!=null){
                System.out.println(ptr.getData());
                ptr=ptr.getNext();
            }
        }
    }
    //--------------------------------------------------------------------------------------------------


    public static void atFirst(){
        Scanner sc=new Scanner(System.in);
        Node newNode=new Node();
        System.out.println("Enter Data");
        newNode.setData(sc.nextInt());
        newNode.setNext(head);
        head=newNode;
    }

    //--------------------------------------------------------------------------------------------
    public static void atLast(){
        Scanner sc=new Scanner(System.in);
        Node newNode=new Node();
        System.out.println("Enter Data");
        newNode.setData(sc.nextInt());
        newNode.setNext(null);
        node.setNext(newNode);
    }
    //--------------------------------------------------------------------------------------------

    public static void atPos(){
        Node trp=head;
        Scanner sc=new Scanner(System.in);
        Node newNode=new Node();
        System.out.println("At Which Position You Want TO Enter");
        int po=sc.nextInt();
        System.out.println("Enter Data");
        newNode.setData(sc.nextInt());
        if(po==1){
            atFirst();
        }
        for(int i=0;i<po-1;i++){
            trp=trp.getNext();
        }
        newNode.setNext(trp.getNext());
        trp.setNext(newNode);


    }
    public static void main(String[] args){

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
                    traversing();
                    break;
                case 3:
                    atFirst();
                    break;
                case 4:
                    atLast();
                    break;
                case 5:
                    atPos();
                    break;
            }
        }while(ch<11);
    }
}
*/

/*DOUBLE LINKED LIST--------------------------------------------------------------------------------------------------------------
* ---------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
 ------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------*/
class Node{
    public int data;
    public Node next;
    public Node prev;

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
public class Sample{
    public static Node node,head,newNode,prevNode,frnt=null,rear=null;

    //-------------------------------------------------------------------------------------------

    public static void menu()
    {
        System.out.println("\n\t\t Main Menu");
        System.out.println("\n\t 1. Create a Linked List");
        System.out.println("\n\t 2. Traverse the Linked List");
        System.out.println("\n\t 3. Insert as a first node");
        System.out.println("\n\t 4. Insert as a last node");
        System.out.println("\n\t 5. Insert as a Position");

    }

    //-------------------------------------------------------------------------------------------

    public static void createList(){
        Scanner sc=new Scanner(System.in);
        node=new Node();
        head=node;
        frnt=node;
        node.setPrev(null);

        do{
            System.out.println("Enter data");
            node.setData(sc.nextInt());
            node.setNext(null);
            rear=node;

            System.out.println("Do you Want To continue");
            char ch=sc.next().charAt(0);
            if(ch=='y'){
                newNode=new Node();
                node.setNext(newNode);
                newNode.setPrev(node);
                node=newNode;
                continue;
            }
            else{
                break;
            }

        }while(true);
    }
    //-------------------------------------------------------------------------------------------
    public static void traversing(){

       if(frnt==null){
           System.out.println("List is empty");
       }
        System.out.println("Elemnts in right to left");
       while(frnt!=null){
           System.out.print(frnt.getData()+" ");
           frnt=frnt.getNext();
       }
        System.out.println("");

        System.out.println("Element from left to right");
       while(node!=null){
           System.out.print(node.getData()+" ");
           node=node.getPrev();
       }
        System.out.println(node.getPrev());
    }

    //------------------------------------------------------------------------------
    public static void atFirst(){
        Scanner sc=new Scanner(System.in);
        newNode=new Node();
        Node head=frnt;
        System.out.println("Enter Data");
        newNode.setData(sc.nextInt());

        if((frnt==null)&&(rear==null))
        {
            frnt=rear=newNode;
            newNode.setPrev(null);
            newNode.setNext(null);
        }
        else{

        }

        newNode.setPrev(null);
        newNode.setNext(head);
        head=newNode;
        frnt=newNode;
    }

    //-------------------------------------------------------------------------------------------
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int ch;
        do {
            menu();
            do {
                ch=scn.nextInt();
                if((ch<1)||(ch>6))
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
                    createList();
                    break;
                case 2:
                    traversing();
                    break;
                case 3:
                    atFirst();
                    break;
//                case 4:
//                    atLast();
//                    break;
//                case 5:
//                    atPos();
//                    break;
            }
        }while(ch<6);


    }
}