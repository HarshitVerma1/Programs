//**  A perfect example of overridden of methods **
class points_2d
{
    int x;
    int y;
    void display()
    {
        System.out.println("x = "+x+", y= "+y);
    }
}


class points_3d extends points_2d
{
    int z;
    void display()
    {
        System.out.println("x = "+x+", y= "+y+", z= "+z);
    }
}
class points
{
    public static void main(String[] args)
    {
        points_2d p1;
        p1=new points_2d();
        points_3d p2;
        p2=new points_3d();
        p1.x=10;
        p1.y=20;
        p1.display();
        p2.x=5;
        p2.y=6;
        p2.z=15;
        p2.display();


    }
}