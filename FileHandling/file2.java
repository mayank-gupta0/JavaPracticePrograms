package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class file2 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file2.txt");
            FileWriter fw=new FileWriter(f);
            if(f.exists()) {
                fw.write("This is from th file2 program");
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
