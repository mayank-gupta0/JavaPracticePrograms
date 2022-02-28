package myPractice;

import java.util.Stack;

public class CFStackDemo {
    public static void main(String[] args){
        Stack<Integer> s1=new Stack<>();
        s1.push(13);
        s1.push(14);
        s1.push(15);
        s1.push(16);
        s1.push(17);

        for(Integer e:s1){
            System.out.println("Stack Elm is :"+e);
        }
        System.out.println("==============================");
        System.out.println("TopMost Elm is :"+s1.peek());

        System.out.println("==============================");
        System.out.println("Poping Elm is :"+s1.pop());

        System.out.println("==============================");
        System.out.println("updated after poping TopMost Elm is :"+s1.peek());
    }
}
