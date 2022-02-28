package java8newfeatures;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Predicate<T>
{
    boolean test(T x);
}
public class functionalInterface3 {
    public static class sample
    {
        private int id;
        private String name;
        private float marks;

        public sample(int tid, String tname, float tmarks)
        {
            this.id=tid;
            this.name=tname;
            this.marks=tmarks;
        }

        @Override
        public String toString() {
            return "sample{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }

        public static void showdetails(List<sample> l, Predicate<sample> cond)
        {
            for (sample x : l) {
                if(cond.test(x))
                    System.out.println(x.toString());
            }
        }
    }
    public static void main(String[] args) {
        List<sample> lst=new ArrayList<>();
        lst.add(new sample(1, "abc", 98));
        lst.add(new sample(2, "def", 90));
        lst.add(new sample(3, "ghi", 60));
        lst.add(new sample(4, "jkl", 65));
        lst.add(new sample(5, "mno", 58));
        lst.add(new sample(6, "pqr", 95));
        lst.add(new sample(7, "stu", 92));
        lst.add(new sample(8, "vwx", 88));
        lst.add(new sample(9, "yza", 85));
        lst.add(new sample(10, "bcd", 33));

        //create the condition
        Predicate<sample> pr1=(p)->(p.marks>90);
        Predicate<sample> pr2=(p)->(p.marks<=60);
        Predicate<sample> pr3=(p)->(p.marks<50);

        System.out.println("\n Marks greater than 90 \n");
        sample.showdetails(lst,pr1);
        System.out.println("\n Marks less than equal to 60 \n");
        sample.showdetails(lst, pr2);
        System.out.println("\n Marks less than 50 \n");
        sample.showdetails(lst, pr3);

    }
}
