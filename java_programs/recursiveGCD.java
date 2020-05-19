public class recursiveGCD
{
	double m,n;
	double gcd(int m,int n)
	{
		if(m>n) return gcd(n,m);
		if(m==n) return m;
		if(m==0) return n;
		return gcd(m,n%m);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("GCD of %d and %d is %d",m,n,gcd(m,n));
	}
}