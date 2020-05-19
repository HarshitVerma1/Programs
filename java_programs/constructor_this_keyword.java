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
	circle(double x,double y,double r)
	{
		this.x=x;this.y=y;this.r=r;
	}
	circle(double r)
	{
	this(0,0,r);
	}
	circle(circle c)
	{
		this(c.x,c.y,c.r);
	}
	circle()
	{
		this(0,0,5);
	}
}
public class constructor_this_keyword
{
	public static void main(String[] args)
	{
		circle c1 = new circle(3,4,5);
		circle c2= new circle(5);
		circle c3= new circle(c1);
		circle c4= new circle();
		System.out.println("Circumference and Area will be respectively : "+c1.circumference()+" And "+ c1.area());
		System.out.println("Circumference and Area will be respectively : "+c2.circumference()+" And "+ c2.area());
		System.out.println("Circumference and Area will be respectively : "+c3.circumference()+" And "+ c3.area());
		System.out.println("Circumference and Area will be respectively : "+c4.circumference()+" And "+ c4.area()); 
	}
}