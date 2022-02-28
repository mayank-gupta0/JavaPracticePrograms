package ClassWork;
import java.util.Scanner;
class arrOpr
{
    private int[] arr;
    private int sz;

    public void init()
    {
        Scanner scn=new Scanner(System.in);
        arr=new int[100];
        //sz value should be greater than equal to 1 and less than 100 size of array
        do {
            System.out.println("\n Enter the number of elements to enter");
            sz=scn.nextInt();
            if((sz<1)||(sz>=100))
            {
                System.out.println("\n Invalid Entry ... try again");
                continue;
            }
            else
                break;
        }while(true);
    }
    public void readarr()
    {
        Scanner scn=new Scanner(System.in);
        for(int i=0; i<sz; ++i)
        {
            System.out.printf("\n arr[%d]=", i);
            arr[i]=scn.nextInt();
        }
    }
    public void display()
    {
        //check if array is empty
        if(sz<=0)
        {
            System.out.println("\n Array Empty ...");
        }
        else
            for(int i=0; i<sz; ++i)
                System.out.printf("%5d", arr[i]);
    }

    public void insfirst()
    {
        Scanner scn=new Scanner(System.in);
        //if inserting one element increases the size to arr.length then array is full
        //element cannot be inserted
        if((sz+1)>=arr.length)
        {
            System.out.println("\n Array Full");
        }
        else
        {
            int i;
            //push each element one place right
            for(i=sz; i>0; --i)
                arr[i]=arr[i-1];
            //insert element at 0 position
            System.out.printf("\n arr[%d]=", i);
            arr[0]=scn.nextInt();
            ++sz;
        }
    }

    public void inslast()
    {
        Scanner scn=new Scanner(System.in);
        //if inserting one element increases the size to arr.length then array is full
        //element cannot be inserted
        if((sz+1)>=arr.length)
        {
            System.out.println("\n Array Full");
        }
        else
        {
            //insert element at the last position
            System.out.printf("\n arr[%d]=", sz);
            arr[sz]=scn.nextInt();
            ++sz;
        }
    }

    public void inspos()
    {
        Scanner scn=new Scanner(System.in);
        //if inserting one element increases the size to arr.length then array is full
        //element cannot be inserted
        if((sz+1)>=arr.length)
        {
            System.out.println("\n Array Full");
        }
        else
        {
            int pos;
            do {
                System.out.println("\n Enter position to insert array to 1 - " + sz + ":");
                pos= scn.nextInt();
                if((pos<1)||(pos>sz))
                {
                    System.out.println("\n Invalid Position ... try again");
                    continue;
                }
                else
                    break;
            }while(true);
            if(pos==1)
                insfirst();
            else
            if(pos==sz)
                inslast();
            else
            {
                int i;
                //push each element one place right till position
                for(i=sz; i>=pos; --i)
                    arr[i]=arr[i-1];
                //insert element at 0 position
                System.out.printf("\n arr[%d]=", i);
                arr[pos]=scn.nextInt();
                ++sz;
            }
        }
    }

    public void deletefst()
    {
        if(sz<=0)
        {
            System.out.println("\n Array Empty ...");
        }
        else
        {
            //push all element left till first position
            for(int i=0; i<sz; ++i)
                arr[i]=arr[i+1];
            --sz;
        }
    }
    public void deletelst()
    {
        if(sz<=0)
        {
            System.out.println("\n Array Empty ...");
        }
        else
        {
            --sz;
        }
    }
    public void delpos()
    {
        Scanner scn=new Scanner(System.in);
        //check if array is empty or not
        if(sz==0)
        {
            System.out.println("\n Array is empty");
        }
        else
        {
            int pos;
            do {
                System.out.println("\n Enter position to insert array to 1 - " + sz + ":");
                pos= scn.nextInt();
                if((pos<1)||(pos>sz))
                {
                    System.out.println("\n Invalid Position ... try again");
                    continue;
                }
                else
                    break;
            }while(true);
            if(pos==1)
                deletefst();
            else
            if(pos==sz)
                deletelst();
            else
            {
                //push each element one place right till position
                for(int i=(pos-1); i<sz; ++i)
                    arr[i]=arr[i+1];
                --sz;
            }
        }
    }

    public void search()
    {
        Scanner scn=new Scanner(System.in);
        //check if array is empty or not
        if(sz==0)
        {
            System.out.println("\n Array is empty");
        }
        else
        {
            int elem, flag=0, i;
            System.out.println("\n Enter element to search : ");
            elem=scn.nextInt();
            for(i=0; i<sz; ++i)
            {
                if(arr[i]==elem)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("\n" + elem + " found at " + (i+1) + " Position");
            else
                System.out.println("\n Element not found");
        }
    }
    public void sortarr() {
        int temp;
        if (sz == 0) {
            System.out.println("\n Array is empty");
        } else {
            for (int i = 0; i < sz; ++i) {
                for (int j = i; j < sz; ++j) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
    public void sortasc()
    {
        if(sz==0)
        {
            System.out.println("\n Array is empty ....");
        }
        else
        {
            int i, j, t;
            for(i=0; i<sz; ++i)
            {
                for(j=i; j<sz; ++j)
                {
                    if(arr[i]>=arr[j])
                    {
                        t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
    }

    public void sortdesc()
    {
        if(sz==0)
        {
            System.out.println("\n Array is empty ....");
        }
        else
        {
            int i, j, t;

            for(i=0; i<sz; ++i)
            {
                for(j=i; j<sz; ++j)
                {
                    if(arr[i]<=arr[j])
                    {
                        t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
    }
}

public class Home1 {
    public static void menu()
    {
        System.out.println("\n\t\t Main Menu ");
        System.out.println("\n\t 1. Create Array");
        System.out.println("\n\t 2. Display Array");
        System.out.println("\n\t 3. Insert as First elment");
        System.out.println("\n\t 4. Insert as Last element");
        System.out.println("\n\t 5. Insert at Desired Position");
        System.out.println("\n\t 6. Delete from First elment");
        System.out.println("\n\t 7. Delete from Last element");
        System.out.println("\n\t 8. Delete from Desired Position");
        System.out.println("\n\t 9. Search in Array");
        System.out.println("\n\t 10. Sort the Array Ascending");
        System.out.println("\n\t 11. Sort the Array Descending");
        System.out.println("\n\t 12. Exit");
        System.out.println("\n\t Please enter your choice from 1 -12 :");
    }
    public static void main(String[] args){
        System.out.println("hello");
        Scanner scn =new Scanner(System.in);
        arrOpr ob=new arrOpr();
        ob.init();
        int ch;
        do {
            do {
                menu();
                ch=scn.nextInt();
                if((ch<1)||(ch>11))
                {
                    System.out.println("\n Invalid choice .... try again");
                    continue;
                }
                else
                    break;
            }while(true);
            switch(ch)
            {
                case 1:
                    ob.readarr();
                    break;
                case 2:
                    ob.display();
                    break;
                case 3:
                    ob.insfirst();
                    break;
                case 4:
                    ob.inslast();
                    break;
                case 5:
                    ob.inspos();
                    break;
                case 6:
                    ob.deletefst();
                    break;
                case 7:
                    ob.deletelst();
                    break;
                case 8:
                    ob.delpos();
                    break;
                case 9:
                    ob.search();
                    break;
                case 10:
                    ob.sortasc();
                    break;
                case 11:
                    ob.sortdesc();
                    break;
            }
        }while(ch<12);
    }
}










