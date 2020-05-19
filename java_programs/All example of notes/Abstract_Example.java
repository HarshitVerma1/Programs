abstract class Ramesh
{
    float x=5,y=7;
    abstract void  Radhe();
    abstract void Shubham();
    abstract float Sum();
}
abstract class Brother extends Ramesh
{
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
        //x=9;y=12; //At here, In abstract method we can change the variable value but In interface we can not change the variable Value because in interface , variables are final and static :)
        return x+y;
    }
    void Papa()
    {
        System.out.println("\nPapa's Info:");
        System.out.println("Mother's Name :"+"Raj Dulari");
        System.out.println("Father's Name :"+"Munshi Lal Verma");
        System.out.println("Date of Birth:"+"04.09.1969");
        System.out.println("Age :"+"51 years");
        System.out.println("Education Detail :"+"12 passed & also appeared B.A.1st Year\n");
    }
}
class  Manmohan  extends Brother{
    void Shubham(){
        System.out.println("Shubham Called");
    }
}
public class Abstract_Example{
    public static void main(String[] args) {
        Manmohan M=new Manmohan();
        M.Shubham();
        M.Papa();
        M.Sum();
        M.Radhe();
        System.out.println("Sum is :"+M.Sum());
    }
}
