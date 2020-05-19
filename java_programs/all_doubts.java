class circle
{
	double x,y,r;
	double circumference()
	{
	return 3.14*2*r;
	}
	double area()
	{
	return 3.14*r*r;
	}
	circle(double a , double b , double c)//because we are using constructor in "main class" or "main method".
	{
		x=a;
		y=b;
		r=c;
	}
}
class box
{
	double w,h,l;
	double parameter()
	{
	return (2*(w*h+h*l+l*w));
	}
	double volume()
	{
		return w*h*l;
	}
	box(double d , double e , double f)//because we are using constructor in "main class" or "main method".
	{
		w=d;
		h=e;
		l=f;
	}
}
public class all_doubts
{
	public static void main(String[] args)
	{
		circle c1=new circle(0,0,5);
		box b1=new box(3,4,5);
		System.out.println("Circumference and Area will be respectively : "+c1.circumference()+" And "+ c1.area()); 
		System.out.println("parameter and volume of box will be : "+b1.parameter()+" and "+b1.volume());
	}
}
