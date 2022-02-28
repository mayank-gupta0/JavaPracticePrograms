package MultiThreading;
import java.util.*;
public class runtimedemo {
    public static void main(String[] args) {
        Runtime r1=Runtime.getRuntime();
        int x;
        Scanner scn=new Scanner(System.in);
        try {
            r1.exec("calc");
            System.out.println("\n enter an integer : ");
            x=scn.nextInt();
            if(x==0)
                r1.exit(0);
            System.out.println("\n free memory : " + r1.maxMemory());
            System.out.println("\n availble memory : " + r1.freeMemory());
            System.out.println("\n Processors availble :" + r1.availableProcessors());
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
