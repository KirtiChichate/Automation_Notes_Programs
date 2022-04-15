
package methods_Study;

public class Example4 {
// non-static method study
	public static void main(String[] args) 
	{
		// calling non static method--> need to create object of a class
		// to create object--> className objectName= new ClassName();
		
		Example4 object= new Example4();// created object of a class
		
		//to call non-static method--> objectname.methodName();
		
		object.demo1();// calling non-Static method using object(same class)
		
		
		System.out.println("Hi This is main method is running");
	
		object.demo1();
		object.demo1();
		
		object.demo2();
		
		// to call non static method form another class
		// need to create object of that class
		Example5 obj5= new Example5();// creating object of example5(another class)
		
		obj5.demo3();// calling Non-Static method from Another class
		obj5.demo4();
		
	}
	
	public void demo1()// created non-static method
	{
		System.out.println("hi Non Static demo1 is running");
		
		
	}
	
	public void demo2()
	{
		System.out.println("hi Non Static demo2 is running");
	}

}


