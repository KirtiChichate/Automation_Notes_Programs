
package exception;

public class ArithMaticExceptuion {

	public static void main(String[] args)
	{
	
		int a=10;
		int b=0;
		
		try 
		{
			int div= a/b;
			System.out.println(div);	
		}
		
		catch (Exception e) 
		{
			System.out.println("b cant be zero");
			e.printStackTrace();
		}
		
		System.out.println("hi ge all");

	}

}