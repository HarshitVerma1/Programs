package package1;
import package1.AccessModifier_in_Class_or_Interface1;
class Radhe{ //<----DefaultAccessModiifier//this class inherit in anirudh class because this class is not public and i want to call in "Main" Class.
    protected void Radhe()  // this method is called in "Main()" by inheritance method and ----> At here we can only use "'public','default' and 'protected'"
    {
        System.out.println("Radhe class & method called which is placed in package1");
    }
}
public class anirudh extends Radhe {
    public void anirudh() // here "void" and "public" is required because Main() is placed in outside Package.
    {
        System.out.println("anirudh() method called which is placed in package1 ");
        AccessModifier_in_Class_or_Interface1 a=new AccessModifier_in_Class_or_Interface1();
        a.shubham();
        Radhe();//calling "with in" package with default access modifier
    }
}
