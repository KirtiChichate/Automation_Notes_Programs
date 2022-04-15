
package control_statements;

public class Switch_study {

	public static void main(String[] args)
	{
		//Please enter Year 
//		1-->You are in 1st year Engg
//		2-->You are in 2nd year Engg
//		3-->You are in 3rd year Engg
//		4-->You are in 4th year Engg
		
		int Year=30;
		
		
		switch (Year) 
		{
		case 1:System.out.println("You are in 1st year Engg");
		break;
		
		case 2: System.out.println("You are in 2nd year Engg");
		break;
		
		case 3: System.out.println("You are in 3rd year Engg");
		break;
		
		case 4: System.out.println("You are in 4th year Engg");
		break;

		default: System.out.println("Please enter values between 1 to 4");
		break;
		}

	}

}


