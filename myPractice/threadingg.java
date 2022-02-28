package myPractice;

/*++++++++++CLASS EXTENDS THREAD CLASS++++++++++++++++++++++++++*/
//class Hi extends Thread{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(500);
//            }
//            catch (Exception e){};
//        }
//    }
//}
//
//class hello extends Thread{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(1000);
//            }
//            catch (Exception e){};
//        }
//    }
//}
/*++++++++++CLASS EXTENDS THREAD CLASS++++++++++++++++++++++++++*/

/*++++++++++CLASS IMPLEMNTIG RUNNABLE INTERFACE+++++++++++++++++++++++++*/

//class Hi implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(500);
//            }
//            catch (Exception e){};
//        }
//    }
//}

//class hello implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(1000);
//            }
//            catch (Exception e){};
//        }
//    }
//}
//public class Sample {
//    public static void main(String[] args) throws InterruptedException {
//        Runnable h1=new Runnable(){  //annonyomus function
//            public void run(){
//                for(int i=0;i<5;i++){
//                    System.out.println("Hi");
//                    try {
//                        Thread.sleep(500);
//                    }
//                    catch (Exception e){};
//                }
//            }
//        };
//        hello h2=new hello();
//
//        Thread th1=new Thread(h1);
//        Thread th2=new Thread(h2);
//
//        th1.start();
//        th1.join();
//
//        th2.start();
//        System.out.println(th1.isAlive());
//        th2.join();
//
//        System.out.println("Main thread");

        /*++++++++++CLASS IMPLEMNTIG RUNNABLE INTERFACE+++++++++++++++++++++++++*/


class count{
    int cnt;
    public synchronized void inc(){
        cnt++;
    }
}

public class threadingg {
    public static void main(String[] args) throws InterruptedException {

        count c=new count();

        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.inc();
                }
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.inc();
                }
            }
        });


        th1.start();
        th2.start();

        th1.join();
        th2.join();
        System.out.println("Count:"+c.cnt);

    }
}
