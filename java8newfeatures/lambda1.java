package java8newfeatures;

@FunctionalInterface
interface fi<T>
{
    T operatorfun(T x, T y);
}
public class lambda1 {
    public static void main(String[] args) {
        int x=5, y=6;
        fi<Integer> ref1=(p1,p2)->(p1+p2);
        System.out.println("\n sum of Integer : " + ref1.operatorfun(x,y));

        fi<String> ref2=(s1,s2)->(s1+" " +s2);
        System.out.println("\n concatenation of String :" + ref2.operatorfun("India", "Great"));
    }
}
