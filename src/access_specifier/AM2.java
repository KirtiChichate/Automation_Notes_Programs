
package access_specifier;

public class AM2
{

	public static void main(String[] args) 
	{
		AM1 m1= new AM1();
		//m1.test3();--> we cant call private methods of another class
		//System.out.println(m1.b);--> we cant call/use private members in another class

		m1.test1();// calling public method from another class(within project)
		m1.test2();// calling protected method from another class(within package+inheritance -->outside package)
		m1.test4();// calling default method from another class(within package only)
	
	}

}
