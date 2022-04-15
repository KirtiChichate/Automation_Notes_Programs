
package polymorphisms;

public class Method_3overriding {

	public static void main(String[] args) 
	{
		Method_overriding a= new Method_overriding();// creating object of super class
		Method_2overriding b = new Method_2overriding();// creating object of sub class
		
		a.wish();// calling super class property
		b.wish();// calling subclass property

	}

}