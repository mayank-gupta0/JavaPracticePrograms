package myPractice;

import java.util.LinkedList;
import java.util.Queue;

public class CFQueueDemo {
    public static void main(String[] args){
        Queue<Integer> q1=new LinkedList<>();

        q1.offer(12);
        q1.offer(13);
        q1.offer(14);
        q1.offer(15);
        q1.offer(16);


        for(Integer e:q1){
            System.out.println("LinkedList Elm is :"+e);
        }
        System.out.println("Peek value:"+q1.peek());

        System.out.println("removing elm is: "+q1.poll());


    }
}
