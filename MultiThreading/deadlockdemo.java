package MultiThreading;

class A{}
class B{}

public class deadlockdemo {
    public static void main(String[] args) {
        A o1=new A();
        B o2=new B();
        Thread t1=new Thread(){
                public void run() {
                    synchronized (o1) {
                        System.out.println("Thread T1 is holding o1");
                        try {
                            sleep(1000);
                        } catch (Exception ex) {
                        }
                        synchronized (o2) {
                            System.out.println("Thread T1 is holding o2");
                        }
                    }
                };};
        Thread t2=new Thread(){
            public void run() {
                synchronized (o2) {
                    System.out.println("Thread T2 is holding o2");
                    try {
                        sleep(1000);
                    } catch (Exception ex) {
                    }
                    synchronized (o1) {
                        System.out.println("Thread T2 is holding o1");
                    }
                }
            };};

        t1.start();
        t2.start();
    }
}
