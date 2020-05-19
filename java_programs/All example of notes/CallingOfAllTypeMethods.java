class CallingOfAllTypeMethods
{
    public static void main(String[] args) {
        CallingOfAllTypeMethods h = new CallingOfAllTypeMethods();// extra work for calling of intance method in static method.
        h.harshit();//calling of intance method in static method.
        amit();//calling of Static_Method in static method.
        Terminator s=new Terminator();//extra work for calling of Constructor(Terminator) and also calling of instance method(which is placed in different class "Terminator") in static method.
        s.Surbhi();
        Terminator.shubham();//At here we can write "s.shubham" instead of "Terminator.shubham();"
        //Calling of static method(which is placed in different class "Terminator") in static method.

    }
    void harshit()//instance method
    {
        System.out.println("harshit() called");
        raju();//calling of instance method in instance method.
    }
    void raju()//instance method
    {
        System.out.println("raju() called");
        abhay();//"abhay static method called in instance method.
    }
    static void amit()//static method
    {
        System.out.println("Amit() static method called in static method.");
    }
    static void abhay()//static method
    {
        System.out.println("abhay() static method called in instance method.");
    }

}

//Next class start
class Terminator
{
    void Surbhi()//instance method
    {
        System.out.println("Surbhi() called");
        CallingOfAllTypeMethods x=new CallingOfAllTypeMethods();
        x.raju();//calling of instance method(which is placed in different class) in instance method.
    }
    static void shubham()//static method
    {
        System.out.println("shubham() static method called in static method.");
    }
    Terminator()//constructor
    {
        System.out.println("Terminator() Constructor called");
    }
}