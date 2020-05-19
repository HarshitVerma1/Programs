Class student
{
	int roll_number;
	float fees;
	String student_name,course_name;
	student(int roll_number,String student_name,String course_name)
	{
		this.roll_number=roll_number;
		this.student_name=student_name;
		this.course_name=course_name;
	}
	student(int roll_number,String student_name,String course_name,float fees)
	{
		this(roll_number,student_name,course_name);
		this.fees=fees;
	}
	void display()
	{
		System.out.println(roll_number+"   *   "+student_name+"    *   "+course_name+"    *   "+fees);	
	}
}
class practice {
	public static void main(String[] args)
	{
		student s1=new student(1884110027,"Harshit verma","programming in java",1100f);
		s1.display();
	}
}