
package control_statements;

public class Else_if_Study {

	public static void main(String[] args) 
	{
		// use in case of more than 2 conditions
//		more than 2 conditions
//		=40-->pass
//		<=60-->2nd class
//		<=75-->1st class
//		>=75 --> Dist
		
		int marks=89;
		
		if(marks==40)
		{
			System.out.println("I am passed");
		}

		else if (marks>40 && marks<=60)//59 60 
		{
			System.out.println("I am in 2nd class");
		}
		else if (marks>60 && marks<75)//61
		{
			System.out.println("I am in 1st class");
		}
		
		else if (marks>=75) //if it having four conditions given then it must be three conditions for elseif//
		{
			System.out.println("I am in Dist");
		}
		
		else 
		{
			System.out.println("I am fail");
		}
		
	}

}
