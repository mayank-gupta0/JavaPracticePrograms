package FileHandling;

import java.io.File;
//create Subdirectory
public class file8 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file3.txt");
            if(!f.exists()) {
                f.mkdirs();
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
