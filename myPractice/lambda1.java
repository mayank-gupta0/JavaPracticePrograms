package myPractice;


public class lambda1 {
    public static void main(String [] args) throws InterruptedException {
        Runnable thread1=()->{
            for(int i=1;i<=10;i++){
                System.out.println("Thread1:= "+i);
                try{
                    Thread.sleep(100);
                }
                catch (Exception e){};
            }
        };
        Runnable thread2=()->{
            for(int i=1;i<=10;i++){
                System.out.println("Thread2:= "+i);
            }
        };

        Thread th1=new Thread(thread1);
        Thread th2=new Thread(thread2);
        th1.setName("Mayank");
        th1.start();

        th2.start();

    }
}
