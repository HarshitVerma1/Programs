import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total number of Rows :");
        int rows = sc.nextInt();
        System.out.println("Enter Total no. of columns :");
        int columns = sc.nextInt();
        int c[][]=new int[rows][columns];
        System.out.println("Enter your Elements :");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.println("Enter Your Element of "+(i+1)+"th row "+(j+1)+"th columns is :");
                c[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.println("Your Element of "+(i+1)+"th row "+(j+1)+"th columns is : "+ c[i][j]);
            }
        }
        System.out.println("Your Entered Array is :");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(c[i][j]+" ");
            }

            System.out.println();
        }
    }
}
