class circle_info
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
    circle_info(double x,double y,double r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }
}
public class this_Keyword
{
    public static void main(String[] args)
    {
        circle_info obj1 =new circle_info(3.0,4.0,5.0);
        circle_info obj2 =new circle_info(4,6,8);
        System.out.println("Diameter Of 1st Circle is : "+obj1.diameter());
        System.out.println("Area Of 1st Circle is : "+obj1.area());
        System.out.println("Diameter Of 2nd Circle is : "+obj2.diameter());
        System.out.println("Area Of 2nd Circle is : "+obj2.area());
    }
}