
package abstract_concept;

public abstract class Test 
{
	public static void main(String[] args)
	{
		//Test t = new Test(); we should not create object of abstract class
	}

	public void demo1()// complete method 
	{
	 System.out.println("HI I AM DEMO1 METHOD");
	}
	
	public void demo2() // complete method 
	{
		
	}
	
	//public void demo();// incomplete method
	
	public abstract void demo3();// abstract method
	
	
}
