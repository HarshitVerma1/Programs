class circle
{
	double x,y,r;
	double circumference()
	{
		return 2*3.14*r;
	}
	double area()
	{
		return 3.14*r*r;
	}
	circle(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	}
}
public class constructor
{
	public static void main(String[] args)
	{
		circle c=new circle(0,0,5);
		System.out.println("Circumference and Area will be respectively : "+c.circumference()+" And "+ c.area()); 
	}
}