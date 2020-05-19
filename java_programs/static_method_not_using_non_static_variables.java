class static_method_not_using_non_static_variables
{
	public static int x = 10;
	public static void main(String[] args) {
		System.out.println("X = "+x);
	}
}