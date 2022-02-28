package MultiThreading;

public class anonymousclassthread {
    public static void main(String[] args) {
        Thread th=new Thread("MyThread"){
          public void run()
          {
              System.out.println("\n Name : " + currentThread().getName());
              System.out.println("\n This is run method");
          }
        };
        th.start();
    }
}
