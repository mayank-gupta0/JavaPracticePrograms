package myPractice;

@FunctionalInterface
interface detail{
    public void display();
}

@FunctionalInterface
interface sum{
    public void su(int x, int y);
}

//class hello implements detail{  // no ned of this now in java8
//    @Override
//   public void display(){
//        System.out.println("Hello i am in hello class");
//    }
//}

public class lambda {
    public static void main(String[] args){

        // we can do like this without creating extra class
        detail d1=new detail() {   // creating annonyumus class
            @Override
            public void display() {
                System.out.println("hello");
            }
        };

        detail d2=new detail() {
            @Override
            public void display() {
                System.out.println("Mayank");
            }
        };

        // using lambda functn implementing defn of interface

        detail d3=()->{
            System.out.println("i am in lambda function");
        };
        d1.display();
        d2.display();
        d3.display();
        //------------------------------------------
        sum s1=new sum() {
            @Override
            public void su(int x, int y) {
                System.out.println("Sum is "+(x+y));
            }
        };

        sum s2=(x,y)->{   //lambda function
            System.out.println("Lambda functn sum is "+(x+y));

        };

        s1.su(2,3);
        s2.su(4,3);

    }
}
