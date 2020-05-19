class calc{
    void cal()   //remove "void" and change/replace method name "calc()" then it will also called. (both default constructor will called.)
    {
        int a=100;
        System.out.println("calc() method called."+a);
    }
}
class X extends calc{
    X()
    {
        int a=12;
        System.out.println("X() method Called."+a);
    }
}
public class  How_a_Sub_Class_can_hide_variable_of_Super_class
{
    public static void main(String[] args) {
        X z=new X(); //remove "void" and change/replace method name "calc()" then it will also called. (both default constructor will called.)
    }
}