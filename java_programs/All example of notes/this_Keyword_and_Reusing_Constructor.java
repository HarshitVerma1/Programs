class Student
{
    int rollno ;
    String name,Course;
    float fees;
    Student(int rollno ,String name,String Course)
    {
        this.rollno=rollno;
        this.name=name;
        this.Course=Course;
    }
    Student(int rollno ,String name,String Course,float fees)
    {
        this(rollno,name,Course);//ReUsing of Contructor
        this.fees=fees;
    }
    void Display()
    {
        System.out.println(rollno+"  "+name+" "+Course+" "+fees+" $\n");
    }
}

public class this_Keyword_and_Reusing_Constructor
{
    public static void main(String[] args)
    {
        Student s1=new Student(1884110027,"Harshit Verma ","   JAVA   ",1100);
        Student s2=new Student(1884110019," Arun Kumar ","C++ Programming",1350);
        Student s3=new Student(1884110005,"Aditya sharma","   Python  ",6987);
        Student s4=new Student(1884110053,"Shubham maddheshiya","Machine Learning",17869);
        s1.Display();
        s2.Display();
        s3.Display();
        s4.Display();
    }
}
