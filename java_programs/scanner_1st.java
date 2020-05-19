import java.util.Scanner;
public class scanner_1st
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1,num2;
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println("sum of given number will be: "+(num1+num2));
	}
}