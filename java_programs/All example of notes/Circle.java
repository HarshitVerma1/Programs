class circleInfo
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
    circleInfo(double a,double b,double c) // there is a Constructor so it is not having any return type
    {
        x=a;
        y=b;
        r=c;
    }
}
public class Circle
{
    public static void main(String[] args)
    {
        circleInfo obj1 =new circleInfo(3,6,8);
        circleInfo obj2 =new circleInfo(4,5,9);
        System.out.println("Diameter Of 1st Circle is : "+obj1.diameter());
        System.out.println("Area Of 1st Circle is : "+obj1.area());
        System.out.println("Diameter Of 2nd Circle is : "+obj2.diameter());
        System.out.println("Area Of 2nd Circle is : "+obj2.area());
    }
}