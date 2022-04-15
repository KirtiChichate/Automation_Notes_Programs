
package Constructor;

public class CS3 {
	// use of user defined constructor to initialize value
	
	int a;// non static variable declaration
	int b;//non static variable declaration
	
	public CS3()
	{
		System.out.println("Running user defined without Paramenter constructor");
		a=10;//assigning value to variable a within constructor
		b=20;//assigning value to variable b within constructor
	}

	public static void main(String[] args) 
	{
	
		CS3 c3= new CS3();
		//CS3 c4= new CS3();
		System.out.println("Value of a is "+c3.a);
		System.out.println("Value of b is "+c3.b);

	}

}


