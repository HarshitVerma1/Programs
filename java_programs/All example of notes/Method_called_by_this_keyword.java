class A
{
    // {System.out.println("Harshit");}
    void m()
    {
        System.out.println("Method m() Called.");
    }
    void n(){
        System.out.println("Method n() Called.");
        //m(); or this.m();
        this.m();
    }
}
public class Method_called_by_this_keyword {
    public static void main(String[] args) {
        A obj1=new A();
        //obj1.m();
        obj1.n();
    }
}
