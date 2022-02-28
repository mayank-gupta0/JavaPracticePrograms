package java8newfeatures;

import java.util.List;

@FunctionalInterface
interface Consumer<T>
{
    void accept(T a);
}
public class functionalinterface4 {
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
    }
    public static void main(String[] args) {
        sample ob1=new sample(1, "abc", 99);
        sample ob2=new sample(2, "def", 95);

        Consumer<sample> c1=(o)-> System.out.println("\n Id = " + o.id + "\t Name = " + o.name + "\t Marks =" + o.marks);

        c1.accept(ob1);
        c1.accept(ob2);
    }
}
