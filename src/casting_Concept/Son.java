
package casting_Concept;

public class Son extends Father{

	public static void main(String[] args) 
	{
	
		Father f= new Father();
		f.money();
		
		Son s= new Son();
		s.money();
		
		
		Father f1=new Son();//upcasting
		f1.money();//

		//f1.bike();--> not eligible as this is from sub class only

		
	}
	
	public void money()
	{
		System.out.println("Sons money 1L");
	}
	
	public void bike()
	{
		System.out.println("Sons Bike pulser");
	}

}