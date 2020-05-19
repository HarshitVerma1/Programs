class only_final_keyword
{
    final int x;
    //x=34;  // this way of initialization of *final* (only) variable is not correct.
    only_final_keyword() {  //only this way of initialization of *final*(only) variable is correct.
        x=34;
    }
}
class Final_with_static_Keyword
{
    final static int my_roll;
    //my_roll=12;  // this way of initialization of *final static* variable is not correct.
    //static my_roll=12;  // this way of initialization of *final static* variable is not correct.
    static { my_roll = 12; } //only this way of initialization of *final static* variable is correct.
}
public class final_with_static_variable {
    public static void main(String[] args) {
        only_final_keyword m = new only_final_keyword();
        Final_with_static_Keyword n = new Final_with_static_Keyword();
        System.out.println("Value of 'x' is : "+m.x);
        System.out.println("Value of 'my_roll' is : "+n.my_roll);
    }
}
