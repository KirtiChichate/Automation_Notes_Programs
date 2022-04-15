
package Constructor_with_parameter;

public class CS4 {

	int a;
	int b;
	int c;
	
	public static void main(String[] args) 
	{
		CS4 c= new CS4();
		c.addition();
		
		CS4 c1= new CS4(100);
		c1.addition();
		
		CS4 c2= new CS4(200, 300);
		c2.addition();
		
		CS4 c3= new CS4(100, 400, 300);
		c3.addition();
		}
	
	public CS4()// zero parameter constructor
	{
		a=10;
		b=20;
		c=30;
		System.out.println("Userdefined without parameter constructor is running");
	}
	
	public CS4(int num)// constructor with parameter
	{
		a=num;
		System.out.println("Userdefined with one parameter constructor is running");
	}
	
	public CS4(int num,int num1)
	{
		a=num;
		b=num1;
		System.out.println("Userdefined with 2 parameter constructor is running");
	}

	public CS4(int num, int num1, int num2)
	{
		a=num;
		b=num1;
		c=num2;
		System.out.println("Userdefined with 3 parameter constructor is running");	
	}

	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("Addition is "+sum);
		
	}
	
	
	
	
}




