package collectionframework;
/*----------------------------------------------------
public class generic7 {
    public static void cntitems(Object [] arr,Object x)
    {
        int cnt=0;
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].equals(x))
                ++cnt;
        }
        System.out.println("\n Number of times " + x + " occurs in array : " + cnt);

    }
    public static void main(String[] args){
        Object arr[]={1,2,3,4,5,6};
        Object darr[]={1.2, 1.5, 2.5, 3.5, 1.2};
        Object sarr[]={"India", "Bhutan", "Nepal", "Maldives", "India"};
        cntitems(arr,2);
        cntitems(darr,1.2);
        cntitems(sarr,"Bhutan");

    }
}   --------------------------------------------------- */

class cl503<T>
{
    private T d1;
    private T d2;

    public cl503(T d1, T d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    public void display()
    {
        System.out.println("\n d1 : " + d1);
        System.out.println("\n d2 : " + d2);
    }
}
public class generic7 {
    public static void main(String[] args) {
        cl503<Integer> ob1=new cl503<>(1,2);
        cl503<Float> ob2=new cl503<>(1.5f,2.8f);
        cl503<String> ob3=new cl503<>("India","Bhutan");

        ob1.display();
        ob2.display();
        ob3.display();
    }
}

