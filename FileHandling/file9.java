package FileHandling;

import java.io.File;

public class file9 {
    public static void main(String[] args) {
        String[] lst;
        try
        {
            File f=new File("G:\\test\\file3.txt");
            if(f.exists()) {
                lst = f.list();
            if(lst.length>0)
                for(int i=0; i<lst.length; ++i)
                    System.out.println(lst[i]);
            System.out.println("Directory created successfully successfully");
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
