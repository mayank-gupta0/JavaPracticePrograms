package FileHandling;
//delete Folder

import java.io.File;

public class file6 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file3.txt");
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
