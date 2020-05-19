package package1;
import package1.h; // At here,'importation of same package' is optional.
public class mobile {
    public void mobi()
    {
        System.out.println("mobile() called which is placed in package2");
        h n=new h();
        n.he();
    }

}
