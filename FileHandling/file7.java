package FileHandling;

import java.io.File;

//creating a directory
public class file7 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file3.txt");
            if(!f.exists()) {
                f.mkdir();
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
