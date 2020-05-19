import java.util.Scanner;
public class max_number_print
{
	public static void main(String[] args) {
		int a,b;
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		b=num.nextInt();
		if(a>b)
			System.out.println(a+"is greater number");
			else
				System.out.println(b+"is greater number");
}
}