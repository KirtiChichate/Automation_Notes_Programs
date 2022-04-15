
package Variable_types;

public class VS1 {

	int a=10;// nonstatic global variable
	static int d= 100;// static global variable
	
	public static void main(String[] args)
	{
		
		VS1 v= new VS1();// created object
		System.out.println("Value of a is "+v.a);// calling Non-Static global variable within class
		//System.out.println("Value of Sum is "+v.sum); cant call local variable
		System.out.println("Value of c is "+d);// calling static global variable from same class
		v.addition();
		v.subtraction();
	}
	
	public void addition()
	{
		int b=20;// local variable
		int sum=a+b;
		System.out.println("Addition is "+sum);
		
	//	int sum1= b+c;  as c is local variable form another method so cant be used
		
	}
	
	
	public void subtraction()
	{
		int c=40;// local variable
		
		int sub=c-d;// using global variable a in sub
		//int sub1= c-b; as b is local variable form another method so cant be used
		System.out.println("Subtraction is "+sub);
		
	}
}


