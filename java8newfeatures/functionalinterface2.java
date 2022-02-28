package java8newfeatures;

@FunctionalInterface
interface Supplier<T>
{
    T get();
}
public class functionalinterface2 {
    static class sample
    {
        private int id;
        private String name;

        public sample(int tid, String tname)
        {
            this.id=tid;
            this.name=tname;
        }

        @Override
        public String toString() {
            return "sample{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Supplier<sample> rf1=()->new sample(1, "abc");
        Supplier<sample> rf2=()->new sample(2, "def");
        Supplier<String> rf3=()->new String("India is great");
        Supplier<String> rf4=()->"India is great";

        System.out.println(rf1.get());
        System.out.println(rf2.get());
        System.out.println(rf3.get());
        System.out.println(rf4.get());
    }
}
