import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Numbers of Element : ");
        int m=sc.nextInt();
        int a[]=new int[m];
        float sum=0; //Don't use integer type because it retuns a value of integer and (value of total no. is also integer) So it will not find "Average" in **flaot numbers**
        for (int i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(i+1)+" th element is : ");
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double avg= (sum/a.length);
        System.out.println("Sum of Entered number is : " +sum);
        System.out.println("Average is : "+avg);
    }
}
