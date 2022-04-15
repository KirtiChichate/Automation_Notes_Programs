
package abstract_concept;

public class CC extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CC c= new CC();
		c.demo1();
		c.demo2();
		c.demo3();
		c.demo4();
		
	}

	@Override
	public void demo3() 
	{
	System.out.println("HI I AM COMPLETED IN Concrete class");
		
	}
	
	public void demo4()
	{
		System.out.println("I am concrete class method");
	}

	

}