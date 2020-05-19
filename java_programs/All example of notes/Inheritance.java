import java.util.Scanner;

class Ram{
    float x,y;
    void Radhe()
        {
            System.out.println("\nHarshit's Info:");
            System.out.println("Mother's Name :"+"Asha Verma");
            System.out.println("Father's Name :"+"Kuldeep Kumar Verma");
            System.out.println("Date of Birth:"+"02.07.2000");
            System.out.println("Age :"+"47 years");
            System.out.println("Education Detail :"+"12 passed & now persuing in B.Tech 2nd Year\n");
        }
        float Sum()
        {
            System.out.println("\nEnter two Number for Summation : ");
            Scanner sc=new Scanner(System.in);
            x=sc.nextFloat();
            y=sc.nextFloat();
            return x+y;
        }
}
class Radhe extends Ram
{
    void Radhe()//overriding
    {
        System.out.println("Inherited override Method Radhe() Called.");
    }
    void Papa()
    {
        super.Radhe();//Called SuperClass Method Radhe()
        System.out.println("\nPapa's Info:");
        System.out.println("Mother's Name :"+"Raj Dulari");
        System.out.println("Father's Name :"+"Munshi Lal Verma");
        System.out.println("Date of Birth:"+"04.09.1969");
        System.out.println("Age :"+"51 years");
        System.out.println("Education Detail :"+"12 passed & also appeared B.A.1st Year\n");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Radhe r=new Radhe();
        r.Papa();
        r.Radhe();//Called subClass Radhe().
        System.out.println("\nSum is : "+r.Sum());
    }
}
