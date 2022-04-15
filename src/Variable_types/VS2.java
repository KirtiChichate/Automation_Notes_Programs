
package Variable_types;

public class VS2 {
	
	int p=70;// non-Static global variable

	public static void main(String[] args) 
	{
		VS2 v2= new VS2();// created object of VS2
		System.out.println("Value of p is "+v2.p);// calling global non-static variable form same class
		
		VS1 v1= new VS1();// created object of another class
		System.out.println("value of a is "+v1.a);//calling global non-static variable form another class

		System.out.println("value of d is "+VS1.d);//calling global static variable form another class class
		
	}

}




