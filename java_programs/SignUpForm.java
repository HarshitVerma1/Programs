import java.applet.*;
import java.awt.Graphics;
import  java.awt.*;
import java.awt.event.*;
public class SignUpForm extends Applet implements ActionListener
{
    String name ,gender,email,address,mobno;
    int age;

    TextField n =new TextField(100);
    CheckboxGroup g=new CheckboxGroup();
    Checkbox m=new Checkbox("Male", g,true);
    Checkbox f=new Checkbox("Female", g,true);
    Choice c=new Choice();
    Label l1=new Label("Enter Name : ");
    Label l2=new Label("Select Gender : ");
    Label l3=new Label("Age : ");
    Label l4=new Label("E-mail  : ");
    TextField t2=new TextField(100);
    Label l5=new Label("Mobile Number   :  ");
    Label l6 =new Label("Address : ");
    TextField t3=new TextField(100);
    TextField t5=new TextField(100);
    Button b1 = new Button("SUBMIT");
    public void init()
    {
        setLayout(null);
        l1.setBounds(20,20,100,20);
        n.setBounds(130,20,100,20);
        l2.setBounds(20,60,100,20);
        m.setBounds(120,60,100,20);
        f.setBounds(220,60,100,20);
        l3.setBounds(20,100,100,20);
        c.setBounds(130,100,100,20);
        l4.setBounds(20,140,100,20);
        t2.setBounds(130,140,100,20);
        l5.setBounds(20,180,100,20);
        l6.setBounds(20,220,100,20);
        t5.setBounds(130,220,100,20);
        t3.setBounds(120,180,100,20);
        b1.setBounds(120,270,100,40);
        add(l1);add(n);add(l2);add(m);add(f);add(l3);
        c.add("16");c.add("17");c.add("18");c.add("19");c.add("20");c.add("21");c.add("22");c.add("23");
        c.add("24");c.add("25");c.add("26");c.add("27");
        add(c);add(l4);add(t2);add(l5);add(t3);add(l6);add(t5);add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString("Name : "+name,50,340);
        g.drawString("Gender : "+gender,50,360);
        g.drawString("Age : "+age,50,380);
        g.drawString("E-mail : "+email,50,400);
        g.drawString("Mobile number : "+mobno,50,420);
        g.drawString("Address : "+address,50,440);
    }
    public void actionPerformed(ActionEvent e)
    {
        name=n.getText();
        gender=g.getSelectedCheckbox().getLabel();
        age=Integer.parseInt(c.getSelectedItem());
        email=t2.getText();
        mobno=t3.getText();
        address=t5.getText();
        repaint();
    }
}
