import java.util.Scanner;
class hi
{
	
	public static void main(String[] args) {
		String username,password;
		System.out.println("\nEnter correct username name And password or use default password :-\n");
		Scanner s = new Scanner(System.in);
		System.out.println("Username");
		username=s.next();
		System.out.println("Password");
		password=s.next();
		if(username.equals(username) && password.equals(password)) {
			System.out.println("Congratulation!!! , you are my legal customer");
			System.out.println("\nItems are available for you...");
			System.out.println("\n1.KINGSTON 8gb ddr4 ram   (price- 46.2 Us$)");
			System.out.println("2.SANDISK 64GB 3.1 usb pendrive    (price- 22.8 Us$)");
			System.out.println("3.Sata 256GB Ssd 42000rpm    (price-41.6 Us$)");
			System.out.println("4.Seagate 4 TB Internal Hard disk    (price-157.14 Us$)");
			System.out.println("\n\nSelect Any item (by serialno.) and get instant discount, this offer only for you\n\n");
			int n=s.nextInt();
				switch(n)
				{
					case 1: 
					{
						System.out.println("Congrates!! you have 10% instant discount on KINGSTON 8gb ddr4 ram ");
						double x=46.2-4.62;
						System.out.println("your payable amount is "+x+" Us$");
						break;

					}
					case 2:
					{
						System.out.println("Congrates!! you have 19% instant discount on SANDISK 64GB 3.1 usb pendrive  ");
						double x=22.8-(22.8*.19);
						System.out.println("your payable amount is "+x+" Us$");
						break;
					}
					case 3:
					{
						System.out.println("Congrates!! you have 20% instant discount on Sata 256GB Ssd 42000rpm ");
						double x=41.6-(41.6*.20);
						System.out.println("your payable amount is "+x+" Us$");
						break;
					}
					case 4:
					{
						System.out.println("Congrates!! you have 25% instant discount on Seagate 4 TB Internal Hard disk ");
						double x=157.14-(157.14*.25);
						System.out.println("your payable amount is "+x+" Us$");
						break;
					}
					default:
					{
						System.out.println("\n\nplease enter correct serial no. of any product\n\n");
						break;
					}
					

				}
			}
		else
		{
			System.out.println("ERROR !! Entered Username Or Password is Incorrect");
		}
	}
}