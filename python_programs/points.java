//**  A perfect example of overridden of methods **
class points_2d{
	int x;
	int y;
	points_2d(int a,int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println("x = "+x+", y= "+y);
	}
}
class points_3d extends points_2d{
	int z;
	points_3d(int c)
	{
		z=c;
	}
	void display()
	{
		System.out.println("x = "+x+", y= "+y+", z= "+z);
	}
}
class points{
	public static void main(String[] args) {
		points_2d p = new points_2d(3,-5);
		p.display();
		points_3d q=new points_3d(1);
		q.display();
		points_2d x=(points_2d) q;
		x.display();
	}
}