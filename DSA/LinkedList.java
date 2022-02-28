package DSA;
class list
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

public class LinkedList {
    public static void main(String[] args) {
        list start;
        list node1=new list();
        list node2=new list();
        list node3=new list();
        list node4=new list();
        list node5=new list();

        start=node1;
        node1.setInfo(100);
        node1.setNext(node2); //linking node1 to node2

        node2.setInfo(200);
        node2.setNext(node3); //linking node2 to node3

        node3.setInfo(300);
        node3.setNext(node4); //linking node3 to node4

        node4.setInfo(400);
        node4.setNext(node5); //linking node4 to node5

        node5.setInfo(500);
        node5.setNext(null);

        try {
            System.out.println("\n Contents of Linked List \n");
            list node = start;
            while (node != null) {
                System.out.printf( "%5d" , node.getInfo());
                node = node.getNext();
            }
        }
        catch(Exception ex)
        {}

    }
}