package Main_Package;
import Harshit.*;
import Mom.*;
import Papa.*;
import Sister.*;
import Harshit.Heirarchy.*;
public class main_class {
    public static void main(String[] args) {
        harsh h=new harsh();
        h.my();
        Sis s=new Sis();
        s.Surbhi();
        Asha a=new Asha();
        a.Lovely_mummy();
        Hero p=new Hero();
        p.kuldeep();
        Mona h1=new Mona(); // At here this will be never call to the default constructor
        h1.Mona(); //this statement is important if you want to invoke the default constructor.
    }
}
