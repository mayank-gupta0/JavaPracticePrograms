package FileHandling;
import java.io.File;

public class file1 {
    public static void main(String[] args) {
        try
        {
            File f=new File("G:\\test\\file1.txt");
            if(f.createNewFile()) {
                System.out.println("\n File created successfully");
            }
            else
                if(f.exists())
                {
                    System.out.println("\n Path : " + f.getPath());
                    System.out.println("\n Absolute Path : " + f.getAbsolutePath());
                    System.out.println("\n Name of the File : " + f.getName());
                    System.out.println("\n Is It a file : " + f.isFile());
                    System.out.println("\n Length ot size of the file :" + f.length());
                }
                else
                    System.out.println("\n File was not created");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
