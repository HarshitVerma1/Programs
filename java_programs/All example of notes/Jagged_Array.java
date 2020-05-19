import java.util.Scanner;
public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total number of Rows :");
        int rows = sc.nextInt();
        int c[][]=new int[rows][];
        for (int i=0;i<rows;i++)
        {
            System.out.println("Enter Total number of columns in"+(i+1)+"th Row");
            int m=sc.nextInt();
            c[i]=new int[m];
        }
        for (int i=0;i<rows;i++)
        {
            System.out.println("Enter elements of "+(i+1)+" th Row");
            for (int j=0;j<c[i].length;j++)
            {
                System.out.println("Enter element of "+(j+1)+" th columns :");
                c[i][j]=sc.nextInt();
            }

        }
        System.out.println("Your's Array is : ");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
