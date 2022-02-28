package java8newfeatures;

public class enum1 {
    //enum is a type or class
    public enum proglang{C, Cplusplus, JavaSE, CSharp;
        public static void show()
        {
            System.out.println("\n this is From enum");
        }
    };
    public enum cities{JAIPUR(100), AJMER(5), BHILWARA(10), SIKAR(15), BANASTHALI(20);
    private int val;
    cities(int t) {
        this.val=t;
    }
    };
    public static void main(String[] args) {
        //creating instance of prolang type
        proglang lang=proglang.C;
        System.out.println(lang);

        System.out.println("\n List of Values \n");
        for(proglang s : proglang.values())
            System.out.println(s);

        System.out.println("\n value of C : " + proglang.C.ordinal());
        System.out.println("\n value of C++ : " + proglang.Cplusplus.ordinal());
        System.out.println("\n value of C++ : " + proglang.CSharp.ordinal());

        System.out.println("\n value of C : " + proglang.valueOf("C"));
        System.out.println("\n value of C++ : " + proglang.valueOf("Cplusplus"));
        System.out.println("\n value of C++ : " + proglang.valueOf("CSharp"));

        proglang.show();

        System.out.println("\n List of Values \n");
        for(cities c : cities.values())
            System.out.println(c.val);
    }
}
