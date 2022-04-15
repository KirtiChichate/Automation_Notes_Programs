
package methods_Study;

import Introduction.double_Use;

public class Math_Op1 {

	public static void main(String[] args) 
	{
		
		Math_Op1 m1= new Math_Op1();
		
		m1.addition();
		
		m1.addition(20, 30);
		m1.addition();
		m1.addition();
		
		m1.addition(20, 20);
		m1.addition(100, -200);
		
		substraction(10.2, 11, 22);

	}

	
	public void addition()// method without Parameters
	{
				// 10+20=30
				int a=10;//1.& 2.
				int b=20;
				int sum;
				sum=a+b;
				System.out.println("Addition is "+sum);	
	}
	
	public void addition(int a, int b)// method with parameters
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
		
	}
	
	public static void substraction(double d, int b, int c)
	{
		
		double sub=d-b-c;
		
		System.out.println("Subtraction is "+sub);
		
	}
}


