import java.applet.*;
import  java.awt.*;
public class General_API extends Applet
{
    FlowLayout f =new FlowLayout(FlowLayout.LEFT,20,20);
    Label l1=new Label("Candidate Name :  ");
    TextField t1=new TextField(25);
    Label l2=new Label("E-mail  : ");
    TextField t2=new TextField(33);
    Label l3=new Label("Mobile Number   :  ");
    TextField t3=new TextField("+91");
    Label l4 =new Label("Address : ");
    TextArea t4=new TextArea(2,30);
    Button b1=new Button("Log in");
    Button b2=new Button("Sign Up");
    TextField t5=new TextField(15);

    public  void init()
    {
        setLayout(f);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        t3.setEditable(false);
        add(t3);
        add(t5);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
    }
}
