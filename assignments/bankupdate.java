package assignments;
import java.util.Random;
import java.util.Scanner;

class bank{
    Scanner sc=new Scanner(System.in);
    String Name;
    Random rand=new Random();
    int acc,ifc,dob;
    int acc_no= rand.nextInt(1000);
    int ifc_code=rand.nextInt(1000);
    long Phone_no;
    long money;
    long total_money;
    final String s="Jaipur";
    int withdraw_money=0,with=0;

    //----------------------------------------------------------------------------------
    public void open(){
        System.out.println("Enter Your Name");
        Name=sc.nextLine();
        System.out.println("Enter Your Contact Number");
        Phone_no=sc.nextLong();

        System.out.println("Enter Your DOB");
        dob=sc.nextInt();
        System.out.println("Name is: "+Name+" Phone No is: "+Phone_no+" DOb is: "+dob+" City:"+s);
        System.out.println("Your Account Has Been Opened");
        System.out.println("Your Account No :"+acc_no+" IFSC Code: "+ifc_code);

    }
    //------------------------------------------------------------------------------------------
    public void deposit(){
        System.out.println("Enter Account No. and ifc code");
        acc=sc.nextInt();
        ifc= sc.nextInt();
        if(acc==acc_no && ifc==ifc_code){
            System.out.println("How Much Amount to deposit");
            money=sc.nextLong();

            total_money+=money;
            System.out.println("Total Amount: "+total_money);
        }
        else{
            System.out.println("Account Does Not Exist!");
        }
    }
}

class withdraw1 extends bank{
    public void setWithdraw_money(){
        System.out.println("Enter Account No. and ifc code");
        acc=sc.nextInt();
        ifc= sc.nextInt();
        if(acc==acc_no && ifc==ifc_code) {
            System.out.println("Your Available Balance is:"+total_money);
            System.out.println("How Much Amount to be withdraw");
            with = sc.nextInt();
            if (with <= total_money) {
                total_money = total_money - with;
                withdraw_money = withdraw_money + with;
            }
            else {
                System.out.println("insufficient balance");
            }
        }
        else{
            System.out.println("Invalid credentials");
        }
    }
    public void Display(){
        if(withdraw_money>0){
            System.out.println("Now Your Available Balance is:"+total_money);
            System.out.println("Your Money Withdraw has been completed "+withdraw_money);
        }
        else{
            System.out.println("Create Your Account First");
        }
    }
    public void close(){
        if(acc_no==acc && ifc_code==ifc){
            acc_no=0;
            ifc_code=0;
            total_money= 0;
            System.out.println("Your Account Has Been Close");
        }
        else{
            System.out.println("Create Your Account First");
        }
    }

    public void menu(){
        System.out.println("Enter 1 to open account\nEnter 2 deposit money\nEnter 3 to withdraw money\nEnter 4 to display\nEnter 5 to close account\nEnter 6 to exit");

    }

}

public class bankupdate {
    public static void main(String[] args){
        withdraw1 b1=new withdraw1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To The Bank");
        System.out.println("Enter 1 to open account\nEnter 2 deposit money\nEnter 3 to withdraw money\nEnter 4 to display\nEnter 5 to close account\nEnter 6 to exit");
        int n=sc.nextInt();
        while(n<=5) {

            switch (n) {
                case 1:
//
                    b1.open();
                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                    b1.menu();
                    n = sc.nextInt();
                    break;
                case 2:
                    b1.deposit();
                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                    b1.menu();
                    n = sc.nextInt();
                    break;
                case 3:
                    b1.setWithdraw_money();
                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                    b1.menu();
                    n = sc.nextInt();
                    break;
                case 4:
                    b1.Display();
                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                    b1.menu();
                    n = sc.nextInt();
                    break;
                case 5:
                    b1.close();
                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                    b1.menu();
                    n = sc.nextInt();
                    break;
            }
        }


    }
}
