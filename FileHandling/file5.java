package FileHandling;

import java.io.File;

public class file5 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file9.txt");
            if(f.exists()) {
                f.delete();
                System.out.println("File Deleted successfully");
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
