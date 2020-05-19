//example of Encapsulation
import java.util.Scanner;
class Point{
    float x,y,z,w;
    double distance;
    Point(float a,float b,float c,float d)
    {
        w=a;
        x=b;
        y=c;
        z=d;
    }
    double Distance()
    {
        return Math.sqrt(Math.pow(y-w,2)+Math.pow(z-x,2));
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        //quesn- If you want that what is distance between two points then you can also create program
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y co-ordinates of p1 point : ");
        float m=sc.nextFloat();
        float n=sc.nextFloat();
        System.out.println("Enter x and y co-ordinates of p2 point : ");
        float o=sc.nextFloat();
        float p=sc.nextFloat();
        Point q=new Point(m,n,o,p);
        System.out.println("your Entered point p1 (x,y) is ="+"("+q.w+" ,"+q.x+");");
        System.out.println("your Entered point p2 (x,y) is ="+"("+q.y+" ,"+q.z+");");
        System.out.println("Distance between these two point is : "+q.Distance()+" Unit");
    }
}
