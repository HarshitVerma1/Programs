class bike
{
	void run(){System.out.println("running bike class");}
}
class Splendor extends bike {
	void run(){System.out.println("running splendor class ");}
	public static void main(String[] args) {
		Splendor b1=new Splendor();
		b1.run();
		bike b2=new bike();
		b2.run();
		bike b3=new Splendor();  //Upcasting..............this , code of line is very tricky and important
		b3.run();
		//Splendor b4=new bike();  /**shows ERROR !!!,because bike class is super class while Splendor class is "specialized version of bike class"(or sub class) */
		//b4.run();
	}
}