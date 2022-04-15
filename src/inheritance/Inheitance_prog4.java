
package inhertance;

public class Son extends Mother {

	public static void main(String[] args)
	{
		Laptop();// calling static method from same class
		nature();// calling static method form super class
		
	Son s= new Son();// creating object of son class	
	s.money();// calling non static method form super class using sub class object
	s.look();// calling non static method form super class using sub class object
	s.Bike();// calling same class method

	}

	public void Bike()
	{
		System.out.println("Sons Bike");
	}
	
	public static void Laptop()
	{
		System.out.println("Sons Laptop");
	}
}
