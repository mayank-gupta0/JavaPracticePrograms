package week2assignment;

import java.io.*;
import java.util.*;

/*. How to serialize an ArrayList in java?
 */
public class Q17 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);

        File f1=new File("F:\\pathsample\\file2.txt");
        f1.createNewFile();
        FileOutputStream foo=new FileOutputStream(f1);
        ObjectOutputStream ood=new ObjectOutputStream(foo);
        ood.writeObject(arr);
        ood.close();
        System.out.println("Done");

        FileInputStream fo=new FileInputStream(f1);
        ObjectInputStream od=new ObjectInputStream(fo);

        ArrayList<Integer> ar2=new ArrayList<>();
        ar2=(ArrayList) od.readObject();

        for(Integer s:ar2){
            System.out.println(s);
        }

    }
}
