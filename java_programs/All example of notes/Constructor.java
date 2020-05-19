import  java.util.Scanner;
class circle_infor
{
    double x,y,radius;
    double area()
    {
        double x=Math.pow(radius,2);
        return (22.0/7.0*x);
    }
    double diameter()
    {
        return (2*22.0/7.0*(radius));
    }
    circle_infor(double a ,double b,double c)
    {
        x=a;
        y=b;
        radius=c;
    }
}
public class Constructor
{
    public static void main(String[] args)
    {
        //System.exit(0);
        circle_info obj1 =new circle_info(3,5,6);
        circle_info obj2 =new circle_info(7,8,9);
        System.out.println("Diameter Of 1st Circle is : "+obj1.diameter());
        System.out.println("Area Of 1st Circle is : "+obj1.area());
        System.out.println("Diameter Of 2nd Circle is : "+obj2.diameter());
        System.out.println("Area Of 2nd Circle is : "+obj2.area());
    }
}