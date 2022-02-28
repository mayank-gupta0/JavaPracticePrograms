package MultiThreading;


public class threaddemo1 {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Java");
        System.out.println("\n class : " + Thread.currentThread().getClass());
        System.out.println("\n State : " + Thread.currentThread().getState());
        System.out.println("\n Name : " + Thread.currentThread().getName());
        System.out.println("\n Priority : " + Thread.currentThread().getPriority());
        System.out.println("\n Number of Threads : " + Thread.activeCount());
    }
}
