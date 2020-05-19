public class avg
{
	public static void main(String args[])
	{
	int a[]={10,20,30,40,50,60,70,80,90,100},i,sum=0;
	float average;
	System.out.println("AVERAGE ELEMENTS ARE : ");
	for(i=0;i<a.length;i++)
	{
	System.out.print(a[i]+" , ");
	}
	for(i=0;i<a.length;i++)
	{
	sum+=a[i];
	}
	System.out.println("Sum of all elements will  be :"+sum);
	average=sum/a.length;
		System.out.println("AVERAGE will be : ");
	System.out.println(average);
	}
}