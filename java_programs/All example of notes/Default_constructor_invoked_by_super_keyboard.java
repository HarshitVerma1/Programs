class Rama{
    Rama(int x)
    {
        int a=x;
        System.out.println("Value of a in Super class is : "+a);
    }
}
class vaishali extends Rama {
    vaishali()
    {
        super(12);//calling of default Constructor  <---- hide to SuperClass variable 'a'
        int a=200;
        System.out.println("Value of a in Sub Class is : "+a);
    }
}
public class Default_constructor_invoked_by_super_keyboard
{
    public static void main(String[] args) {
        int a=99999;
        System.out.println("value of a in main method is : "+a);
        vaishali x=new vaishali(); // Automatic calling of default constructor
    }
}
