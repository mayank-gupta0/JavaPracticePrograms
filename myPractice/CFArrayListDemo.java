package myPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class CFArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrr=new ArrayList<>();
        ArrayList<Integer> arrr1=new ArrayList<>();
        arrr.add(10);
        arrr.add(11);
        arrr.add(12);
//-----------------------------------------------------
        arrr.add(1,120);
        System.out.println("original array: "+arrr);
//-----------------------------------------------------
        arrr1.addAll(arrr);
        System.out.println("clone array :"+arrr1);
        System.out.println("Value accesing:"+arrr1.get(2));
//-----------------------------------------------------
        arrr1.remove(2);
        System.out.println("After Removing by passing index :"+arrr1);

        //-----------------------------------------------------

        arrr1.remove(Integer.valueOf(120));
        System.out.println("After Removing Direct Value nOT BY INDEX:"+arrr1);

//Traversing Array:
        for(int i=0;i<arrr.size();i++){
            System.out.println("Value are: "+arrr.get(i));
        }
        System.out.println("================================");
        //for each loop:
        for(Integer e:arrr){
            System.out.println("FOREACH loop: "+e);
        }
        System.out.println("================================");

        // iterator method

        Iterator<Integer> itr=arrr.iterator();
        while(itr.hasNext()){
            System.out.println("By Iterator: "+itr.next());
        }
    }
}
