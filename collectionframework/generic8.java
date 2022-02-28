package collectionframework;

class cl504<T>
{
    private T[] arr;

    public cl504(T[] arr) {
        this.arr = arr;
        //intantiation of the array inside a generic class is not possible
    }
    public void display()
    {
        for(T x : arr)
            System.out.println(x);
    }
}
public class generic8 {
    public static void main(String[] args) {
        Integer[] arr1={1,2,3,4,5};
        Double[] arr2={1.2, 2.3, 3.4, 4.5};
        String[] arr3={"India", "Bhutan", "Nepal"};

        cl504<Integer> ob1=new cl504<>(arr1);
        ob1.display();
        cl504<Double> ob2=new cl504<>(arr2);
        ob2.display();
        cl504<String> ob3=new cl504<>(arr3);
        ob3.display();
    }
}
