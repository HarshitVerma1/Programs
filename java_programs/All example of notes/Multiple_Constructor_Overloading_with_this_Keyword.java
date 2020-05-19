class Circle_infor
{
    double x,y,r;
    double area()
    {
        return (22.0/7.0*r*r);
    }
    double diameter()
    {
        return (2*22.0/7.0*(r));
    }
    //    ---> Let's Start
    Circle_infor(double x,double y,double r) // there is a Constructor so it is not having any return type
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }
    Circle_infor() // there is a Constructor so it is not having any return type
    {
        x=1.0;
        y=3.5;
        r=1.0;
        //or  this(1.0,3.5,1.0)
    }
    Circle_infor(double r) // there is a Constructor so it is not having any return type
    {
        this.r=r;
    }
    Circle_infor(Circle_infor c)   // there is a Constructor so it is not having any return type
    {
        x=c.x;
        y=c.y;
        r=c.r;
        //or this(c.x,c.y,c.r)
    }
}
public class Multiple_Constructor_Overloading_with_this_Keyword
{
    public static void main(String[] args)
    {
        Circle_infor obj1 =new Circle_infor(3,6,8);
        Circle_infor obj2=new Circle_infor(7);
        Circle_infor obj3 =new Circle_infor();
        Circle_infor obj4=new Circle_infor(obj1);
        System.out.println("Diameter Of 1st Circle is : "+obj1.diameter());
        System.out.println("Area Of 1st Circle is : "+obj1.area());
        System.out.println("Diameter Of 2nd Circle is : "+obj2.diameter());
        System.out.println("Area Of 2nd Circle is : "+obj2.area());
        System.out.println("Diameter Of 3rd Circle is : "+obj3.diameter());
        System.out.println("Area Of 3rd Circle is : "+obj3.area());
        System.out.println("Diameter Of 4th Circle is : "+obj4.diameter());
        System.out.println("Area Of 4th Circle is : "+obj4.area());
    }
}