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
}
public class circle_information
{
	public static void main(String[] args)
	{
		circle c = new circle();
		c.x=0;
		c.y=0;
		c.r=5;
		System.out.println("Circumference and Area will be respectively : "+c.circumference()+" And "+ c.area()); 
	}
}