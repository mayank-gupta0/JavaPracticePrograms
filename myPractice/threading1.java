package myPractice;

//INTER COMMUNICATION BTW TWO THREADS
class Company
{
    int n;
    boolean f=false;
    // f=false: chance: producer
    //f=true: chance :consumer
    synchronized public void produce_item(int n)
    {
        if(f)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n=n;
        System.out.println("Produced : "+this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item()
    {
        if(!f)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed : "+this.n);
        f=false;
        notify();
        return this.n;
    }
}

class Producer extends Thread
{

    Company c;
    Producer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            this.c.produce_item(i);
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}

class Consumer extends Thread{
    Company c;
    Consumer(Company c)
    {
        this.c=c;
    }

    public void run()
    {
        while(true)
        {
            this.c.consume_item();
            try{Thread.sleep(5000);}catch(Exception e){}
        }
    }
}

public class threading1 {
    public static void main(String[] args){

        Company comp=new Company();
        Producer p=new Producer(comp);
        Consumer c=new Consumer(comp);
        p.start();
        c.start();

    }
}
