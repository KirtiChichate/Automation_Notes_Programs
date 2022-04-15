
package methods_Study;

public class Math_Operation {

	public static void main(String[] args) 
	{
		addition();// calling static method
		//to call non static method--> need to create object
		
		Math_Operation m= new Math_Operation();// created object "m"

		//m.substraction();
		m.substraction1();
		
	}
	
	public static void addition()// Static Method
	{
		// 10+20=30
		int a=10;//1.& 2.
		int b=20;
		int sum;
		sum=a+b;
		System.out.println("Addition is "+sum);
		
	}
	
	public void substraction()// Non-Static
	{
		//20-10.5==number
		int c=20;
		int d=10;
		int sub;
		sub=c-d;
		System.out.println("Substraction is "+sub);
	}
	
	public void substraction1()// Non-Static
	{
		//20-10.5==number
		int c=20;
		float d=10;
		float sub;
		sub=c-d;
		System.out.println("Substraction is "+sub);
	}
	
	

}


