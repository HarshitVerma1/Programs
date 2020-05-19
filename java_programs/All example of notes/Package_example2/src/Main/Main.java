package Main;
import Asha.*;
import Kuldeep.*;
import Raja.*;
import Surbhi.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a;
        System.out.println("Enter a your's family member name if you want to know about them :");
        Scanner name=new Scanner(System.in);
        a=name.nextLine();
        if (a.equals(("Harshit"))|a.equals("harshit")|a.equals("harshit verma")|a.equals("Harshit Verma")|a.equals("Harshit verma")|a.equals("HARSHIT VERMA")|a.equals("HARSHIT"))
        {
            Harshit h =new Harshit();
            h.Harshit();
        }
        else if (a.equals(("kuldeep"))|a.equals("kuldeep kumar")|a.equals("Kuldeep")|a.equals("Kuldeep Kumar")|a.equals("Kuldeep Kumar Verma")||a.equals("Kuldeep kumar")|a.equals("kuldeep Kumar verma")|a.equals("Kuldeep Verma")||a.equals("Kuldeep verma")|a.equals("kuldeep verma")|a.equals("KULDEEP")|a.equals("kuldeep kumar verma"))
        {
            Papa p =new Papa();
            p.Papa();
        }
        else if (a.equals(("Asha"))|a.equals("asha")|a.equals("asha verma")|a.equals("Asha Verma")|a.equals("Ashaverma")|a.equals("ASHA"))
        {
            Mom m=new Mom();
            m.Mom();
        }
        else if (a.equals(("Surbhi"))|a.equals("surbhi")|a.equals("surbhi verma")|a.equals("Surbhi Verma")|a.equals("Surbhiverma")|a.equals("Moti")|a.equals("moti")|a.equals("SURBHI VERMA")|a.equals("MOTI"))
        {
            Surbhi s =new Surbhi();
            s.Surbhi();
        }
        else
        {
            System.out.println("Entered Name is not your family member");

        }
    }
}
