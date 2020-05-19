public class use_of_argument_array
{
public static void main(String[] args) {
	if (args.length>0) {
		System.out.println("commands and Arguments are : ");
		for (String val:args ) {
			System.out.println(val); 
		}
	}
	else
	{
		System.out.println("There are No command line and No Arguments");
	}
}
}
/*NOTE-:  "java use_of_argument_array" k aage hi command line me likhte rhna hai.....
           agar ENTER press kr denge tb "There are No command line and No Arguments"
           print ho jayega */