
package interface_study;

public class Final_Study
//use of final keyword
{
	int a=10;//global variable
	static int b=20; 
	final int c=40;
	public static void main(String[] args)
	{
		Final_Study f= new Final_Study();
		f.add();
	}
	
	public void add()
	{
		a=a+10;
		System.out.println("Updated vlaue of a is "+a);
		b=b+30;
		System.out.println("Updated vlaue of b is "+b);
		//c=c+90;--> we cant change values of final variables
	}

}
