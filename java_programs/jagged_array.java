import java.util.Scanner;
class jagged_array
{
	public static void main(String[] args) {
		Scanner h =new Scanner(System.in);
		System.out.println("Enter no. of rows of  jagged array");
		int a=h.nextInt();
		int num[][]=new int [a][];
		for (int i=0; i<a; i++) {
			System.out.println("Enter element's no. of  "+(i+1)+"  row  ");
			int b=h.nextInt();
			num[i]=new int[b];
		}
		System.out.println("Enter Value");
		for (int i=0;i<num.length;i++ ) {
			for (int j=0; j<num[i].length; j++) {
				num[i][j]=h.nextInt();
				
			}
			
		}
		System.out.println("You Entered  ");
		for (int i=0; i<num.length;i++ ) {
			for (int j=0; j<num[i].length;j++ ) {
				System.out.println(num[i][j]+"  ");
			}
			System.out.println();
		}
	}
}