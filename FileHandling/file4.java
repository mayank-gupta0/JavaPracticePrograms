package FileHandling;

import java.io.File;
import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file3.txt");
            Scanner dr=new Scanner(f);
            if(f.exists()) {
                while(dr.hasNextLine())
                    System.out.println(dr.nextLine());

                System.out.println("Data read successfully");
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
