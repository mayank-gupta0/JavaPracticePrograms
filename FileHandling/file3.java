package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class file3 {
    public static void main(String[] args) {
        String str;
        try
        {
            File f=new File("G:\\test\\file3.txt");
            FileWriter fw=new FileWriter(f);
            Scanner scn=new Scanner(System.in);
            char ch;
            if(f.exists()) {
                System.out.println("\n Please enter String, when finished just press * \n");
                do {
                    str=scn.next();
                    fw.write(str + "\n");
                    System.out.println("\n do you want to continue (Y/N) :");
                    ch=scn.next().charAt(0);
                }while((ch=='Y')||(ch=='y'));
                System.out.println("Data written successfully inside file");
                fw.close();
            }
            else
                System.out.println("\n File does not exits");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
