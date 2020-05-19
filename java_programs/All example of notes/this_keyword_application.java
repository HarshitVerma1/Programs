class My
{
    My()
    {

        System.out.println("Original My called.");
    }
    My(int x)
    {
        this();//refers to another Constructor and called.
        System.out.println(x);
    }
}
public class this_keyword_application
{
    public static void main(String[] args) {
        //My obj1=new My();//--->called original My only
        My obj2=new My(9);//--->called overloaded Constructor
    }
}
