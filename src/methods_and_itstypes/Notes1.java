
// Class study Programme on date 14/12/2021//



package methods_Study;

public class Example1 {
	public static void main(String[] args)  
	{
		test2();
		test2();
		test2();
		System.out.println("Hi Main method is running");
		// how to call Static regular method from same class
		test1();// calling static regular method from same class
		System.out.println("main method is ended");
		test1();
		Example2.method1();// calling static method form another class// classname.methodname
		Example2.method2();
	}
	
	//public static void test();//method declaration--> Incomplete method, it dont have body(definition)
	
	public static void test1() // method with definition --> Complete method
	{
		System.out.println("Hi This is test1 static regular method running");
	}
	
	public static void test2()
	{
		System.out.println("Hi This is test2 static regular method running");
	}

}