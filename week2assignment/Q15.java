package week2assignment;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*How to serialize a HashMap in java?
 */

public class Q15 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put("one",10);
        h1.put("two",11);
        h1.put("three",12);
        h1.put("four",13);

        File f=new File("F:\\pathsample\\file1.txt");
        f.createNewFile();
        FileOutputStream fos=new FileOutputStream(f); //it helps to write data in primitive types in file.
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(h1);
        oos.close();  //by this changes done in hdd
        System.out.println("sussceful");



        HashMap<String, Integer> map = null;
        FileInputStream foo=new FileInputStream(f);
        ObjectInputStream ood=new ObjectInputStream(foo);

        map = (HashMap) ood.readObject();

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Map.Entry mentry = (Map.Entry)itr.next();
            System.out.println("key="+ mentry.getKey() + " & Value="+mentry.getValue());
        }
    }
}