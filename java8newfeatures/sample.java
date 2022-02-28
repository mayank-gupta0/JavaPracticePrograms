package java8newfeatures;

import java.util.ArrayList;

interface Prediate<T>{
    boolean test(T x);
}

public class sample {
    public static class Emp {
        private String name;
        private String gender;
        private long salary;

        Emp(String name, String gender, long salary) {
            this.name = name;
            this.gender = gender;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public static void show(ArrayList<Emp> ls,Prediate<Emp> cond){
            for (Emp x : ls) {
                if(cond.test(x))
                    System.out.println(x.toString());
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Emp> ls = new ArrayList<>();
        ls.add(new Emp("Mayank", "Male", 10000));
        ls.add(new Emp("Delvin", "Male", 20000));
        ls.add(new Emp("Shruti", "Female", 30000));
        ls.add(new Emp("Anjali", "Female", 40000));
        ls.add(new Emp("Shubham", "Male", 50000));
        ls.add(new Emp("Ayushi", "Female", 60000));
        ls.add(new Emp("Kunal", "Male", 5000));

        Prediate<Emp> pr1=(p)->(p.salary>=10000 && p.gender=="Male");
        Prediate<Emp> pr2=(p)->(p.salary>=10000 && p.gender=="Female");

        Prediate<Emp> pr3=(p)->(p.gender=="Female");

        System.out.println("Male are:");
        Emp.show(ls,pr1);
        System.out.println("Female are:");
        Emp.show(ls,pr2);

        System.out.println("All Females Candidates are");
        Emp.show(ls,pr3);

    }
}
