class Student
{  
	int rollno;  
	String name, course;  
	float fee;  
	Student(int rollno, String name, String course)
	{  
	this.rollno = rollno;  
	this.name = name;  
	this.course = course;
    }  
Student(int rollno, String name, String course, float fee)
{  
	this(rollno,name,course);//reusing constructor  
	this.fee=fee;  
}  
void display()
{
	System.out.println(rollno+"  *  "+name+" * "+course+"  *  "+fee);
}  
}  
class reusing_constructor
{  
	public static void main(String args[]){  
		Student s1=new Student(1884110027,"HARSHIT VERMA","Programming in JAVA",1100f);
		Student s2=new Student(1884110038,"MOHIT JAISHWAL","Programming in JAVA",2000f);
		Student s3=new Student(1884110053,"SHUBHAM MADHHESHIYA","Programming in JAVA",1800f);
		Student s4=new Student(1884110005,"ADITYA SHARMA","Programming in JAVA",1500f);
		Student s5=new Student(1884110049,"SHASHANK DWIVEDI","DATA STRUCTURE IN PYTHON",500f);
		Student s6=new Student(1884110061,"UMESH YADAV","ETHICAL HACKING",900f);
		Student s7=new Student(1884110041,"PRASHANT SINGH","PERSONALITY DEVELOPMENT AND HUMAN SOFT SKILLS",1100f);
		Student s8=new Student(1884110044,"PUNYA PRAKASH GAURAV","CALCULAS WITH MULTI VARIABLES",1300f);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
		s8.display(); 
}
}  