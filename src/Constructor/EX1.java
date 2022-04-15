
package Constructor;

public class EX1 {
// this example for Variable in class 
	int a=10;//non static-variable initialization--> Manually 
	int b=20;//non static variable initialization--> Manually
	static int c=50;// static variable
	
	public static void main(String[] args)
	{
		EX1 e= new EX1();
		System.out.println("Value of a is "+e.a);
		System.out.println("Value of b is "+e.b);
		System.out.println("Value of c is "+c);
		

	}
	
	

}

