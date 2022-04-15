
package interface_study;



public class Son implements Father,Mother{
//multiple inheritance is achieved here
	public static void main(String[] args) 
	{
		Son s= new Son();// created object of implementation class
		s.mobile();
		s.money();
		s.rules();
		s.love();
		s.nature();
		Father.nature();

	}
	
	public void mobile()
	{
		System.out.println("This is Sons mobile");
	}

	public void love() 
	{// to all specific method from super interface use below syntax
		//interfacename.super.methodName;
		
		Mother.super.love();
		Father.super.love();
		System.out.println("Sons Love");
	}
	
	
	@Override
	public void nature() {
		System.out.println("Mothers nature completed in Sons class");
		
	}

	@Override
	public void money() {
		System.out.println("Fathers money completed in Sons class");
		
	}

	@Override
	public void rules() {
		System.out.println("Fathers rules completed in Sons class");
		
	}

	}
