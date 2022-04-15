
package control_statements;

public class Nested_if_Else_Study {

	public static void main(String[] args) {
//		1st Enter username if its correct then enter password--> please check password incase password is wrong,
		//Signing in, welcome to home page

		String username="Velocity";
		String password="Velocity@123";
		int captcha=1234;
		
		if (username=="Velocity1")
		{
			System.out.println("Username is correct, Please enter password");
			if(password=="Velocity@12")
			{
				System.out.println("Password is correct,Please enter captcha");
				
				if(captcha==1234)
				{
					System.out.println("Signing in, welcome to home page");
				}
				else {
					System.out.println("Wrong captcha, please retry");
				}
			}
			else {
				System.out.println("please check password");
			}
		}
		
		else {
			System.out.println("Username incorrect, please try again");
		}
		
		
		
		
		
		
	}

}