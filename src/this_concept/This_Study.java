
package this_concept;

public class This_Study {

	int a=100;// non-Static global  variable
	int c=20;
	static int b=200;// static global variable
	public static void main(String[] args)
	{
		This_Study ts= new This_Study();
		ts.test();

	}
	
	public void test()
	{
		//int b=300;
		int a=50;// local variable
		int sum=10+a;// using local value of a-->50
		System.out.println("Printing local value of a "+a);
		System.out.println("Prinitng globle value of a "+this.a);
		System.out.println("Sum value is "+sum);
		
		int sum1=10+this.a;//using global value of a-->100
		System.out.println("Sum is "+sum1);
		
		int sub=10-b;
	}
	
	public static void test2()
	{
		int sub=200-b;
		//in static method we can only static variable--> we cant call non static variables
		
	}

}
