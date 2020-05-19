/*
class father{
    void hobies()
    {
        System.out.println("play Cricket and volleyball");
    }
}
class mother{
    void Duty(){
        System.out.println("All Mothers love her children.");
    }
}
class son extends father{
    void My_feelings()
    {
        System.out.println("I Love you my lovely Papa !!!");
    }
}
class son extends mother{
    void My_Heart()
    {
        System.out.println("I Love you  my dear Mumma !!!");
    }
}*/

//Let's now we will see Concept of INTERFACE
interface father
{
    void hobies();
}

interface mother
{
    void Duty();
}

class son implements father,mother
{
    void son()
    {
        System.out.println("I Love you my lovely Papa !!!");
    }

    @Override
    public void Duty() {
        System.out.println("All Mothers love her children.");
    }

    @Override
    public void hobies() {
        {
            System.out.println("play Cricket and volleyball");
        }
    }
}

public class Why_is_need_interface {
    public static void main(String[] args) {
        son x=new son();
        x.hobies();
        x.Duty();
    }
}
