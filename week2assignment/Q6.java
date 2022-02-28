package week2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*Write a program to sort ArrayList using Comparable and Comparator?*/
class Student implements Comparable<Student>{
    public String Name;
    public  int Age;
    public int Roll;

    public Student(String name, int age, int roll) {
        Name=name;
        Age=age;
        Roll=roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        this.Roll = roll;
    }

    public String toString(){
        return "Student [Name="+Name+",Age="+Age+",Roll="+Roll+" ]";
    }

    @Override
    public int compareTo(Student o) {
        if(this.getAge()>o.getAge()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class Q6 {
    public static void main(String[] args){
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(new Student("Mayank",24,129));
        arr.add(new Student("Delvin",21,124));
        arr.add(new Student("Shubham",22,125));
        Collections.sort(arr);

        for(Student s:arr){
            System.out.println(s);
        }

        //sorting using comparator
        ArrayList<Integer> ar1=new ArrayList<>();
        ar1.add(20);
        ar1.add(19);
        ar1.add(1);
        ar1.add(80);
        ar1.add(12);

        Collections.sort(ar1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for(Integer s:ar1){
            System.out.println(s);
        }

        /*Comparable and Comparator interfaces are used to compare objects of a class The Comparable interface is used to set
         a natural ordering pattern for the class The Comparator interface is used when we need multiple ways of comparing objects
          Comparator is also useful when we don't have access to the original class.*/
    }
}
