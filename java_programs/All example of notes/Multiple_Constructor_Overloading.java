class circle
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
    circle(double a,double b,double c) // there is a Constructor so it is not having any return type
    {
        x=a;
        y=b;
        r=c;
    }
    circle() // there is a Constructor so it is not having any return type
    {
        x=1.0;
        y=3.5;
        r=1.0;
    }
    circle(double c) // there is a Constructor so it is not having any return type
    {
        r=c;
    }
    circle(circle c)   // there is a Constructor so it is not having any return type
    {
        x=c.x;
        y=c.y;
        r=c.r;
    }
}
public class Multiple_Constructor_Overloading
{
    public static void main(String[] args)
    {
        circle obj1 =new circle(3,6,8);
        circle obj2=new circle(7);
        circle obj3 =new circle();
        circle obj4=new circle(obj1);
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