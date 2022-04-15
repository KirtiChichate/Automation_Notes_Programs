
package exception;

public class StringIndexOutOfBoundStudy {

	public static void main(String[] args) {
		
		String a="Velocity";
		
		try {
		System.out.println(a.charAt(0));
		}
		
		catch (StringIndexOutOfBoundsException e) 
		{
		System.out.println("please select range between 0-7");	
		e.printStackTrace();
		}
	}

}