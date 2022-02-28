package assignments;
import java.util.Scanner;
public class Day1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Q1:Program to Read and Print a RxC Matrix, R and C must be input by the User : This program will
        //read a two dimensional array (Matrix), number of rows (R) and number of columns (C) will be
        //read through the User
    /*
        System.out.println("Enter No. of Row");
        int rows=sc.nextInt();
        System.out.println("Enter No. of Column ");
        int col=sc.nextInt();
        int a[][]=new int[rows][col];
        System.out.println("Ente Values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Values are");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

        */
        //-----------------------------------------------------------

        //Q2:Program to Read a Matrix and find Sum and Product of all elements :
        /*
        int sum=0;
        int product=1;

        System.out.println("Enter No. of Row");
        int rows=sc.nextInt();
        System.out.println("Enter No. of Column ");
        int col=sc.nextInt();
        int a[][]=new int[rows][col];
        System.out.println("Ente Values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Values are");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                sum=sum+a[i][j];
                product=product*a[i][j];

            }
        }
        System.out.println("Sum is "+sum+" Product is "+product);     */
        //-----------------------------------------------------------------------------

        //Q3:Program to find Sum of all elements of each row of a matrix

        /*
        int sum;

        System.out.println("Enter No. of Row");
        int rows=sc.nextInt();
        System.out.println("Enter No. of Column ");
        int col=sc.nextInt();
        int a[][]=new int[rows][col];
        System.out.println("Enter Values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Values are");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<rows;i++){
            sum=0;
            for(int j=0;j<col;j++){
                sum=sum+a[i][j];

            }
            System.out.println("Sum of each row is "+sum);
        }     */
        //-----------------------------------------------------------------

        //Q4 : This Program will read a matrix and print its transpose matrix.
        /*
        System.out.println("Enter No. of Row");
        int rows=sc.nextInt();
        System.out.println("Enter No. of Column ");
        int col=sc.nextInt();
        int a[][]=new int[rows][col];
        System.out.println("Enter Values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Values are");
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        int trows=col;
        int tcol=rows;
        int b[][]=new int[trows][tcol];
        for(int i=0;i<trows;i++){
            for(int j=0;j<tcol;j++){
                b[i][j]=a[j][i];
            }
        }
        for(int i=0;i<trows;i++){
            for(int j=0;j<tcol;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }             */

        //--------------------------------------------------------------------------

        //Q5 Program to Read a Matrix and Print Diagonals
        /*
        int sum=0;
        int count=0;
        System.out.println("Enter No. of Row");
        int rows=sc.nextInt();
        System.out.println("Enter No. of Column ");
        int col=sc.nextInt();
        int a[][]=new int[rows][col];
        System.out.println("Enter Values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Values are");
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        for(int i=0;i<rows;i++){
                sum=sum+a[i][count];
                count++;
        }
        System.out.println("Diagonal sum is "+sum);   */

        //Q6:


    }
}
