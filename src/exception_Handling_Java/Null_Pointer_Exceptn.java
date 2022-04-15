
package exception;

public class NullPointerExceptionStudy {

	public static void main(String[] args) 
		{
		

		String a=null;
		try 
		{
		
		System.out.println(a.charAt(0));
		}
		
		catch (NullPointerException e) 
		{
			System.out.println("Cant do operation on null object");
		}
		
		
		
	}

}