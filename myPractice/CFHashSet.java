package myPractice;

import java.util.HashSet;
import java.util.Set;

public class CFHashSet {
    public static void main(String[] args){
        Set<Integer> hash1=new HashSet<>();

        hash1.add(12);
        hash1.add(13);
        hash1.add(14);
        hash1.add(15);
        hash1.add(16);

        for(Integer e:hash1){
            System.out.println("hashSet Elm is :"+e);
        }
    }
}
