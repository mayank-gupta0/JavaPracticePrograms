package DSA;
class dlist
{
    private int info;
    private dlist prev;
    private dlist next;
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public dlist getPrev() {
        return prev;
    }
    public void setPrev(dlist prev) {
        this.prev = prev;
    }
    public dlist getNext() {
        return next;
    }
    public void setNext(dlist next) {
        this.next = next;
    }
}
public class dLinkedList {
    public static void main(String[] args) {
        dlist frnt=null, rear=null;
        dlist node1=new dlist();
        dlist node2=new dlist();
        dlist node3=new dlist();
        dlist node4=new dlist();
        dlist node5=new dlist();
        frnt=node1;
        node1.setInfo(100);
        node1.setPrev(null);
        node1.setNext(node2); //linking node1 to node2

        node2.setInfo(200);
        node2.setPrev(node1);
        node2.setNext(node3); //linking node2 to node3

        node3.setInfo(300);
        node3.setPrev(node2);
        node3.setNext(node4); //linking node3 to node4

        node4.setInfo(400);
        node4.setPrev(node3);
        node4.setNext(node5); //linking node4 to node5

        node5.setInfo(500);
        node5.setPrev(node4);
        node5.setNext(null);
        rear=node5;
        try {
            System.out.println("\n Contents of Doubly Linked List Top to bottom \n");
            dlist node = frnt;
            while (node != null) {
                System.out.printf( "%5d" , node.getInfo());
                node = node.getNext();
            }
        }
        catch(Exception ex)
        {}
        try {
            System.out.println("\n Contents of Doubly Linked List Bottom to Top \n");
            dlist node = rear;
            while (node != null) {
                System.out.printf( "%5d" , node.getInfo());
                node = node.getPrev();
            }
        }
        catch(Exception ex)
        {}
    }
}












