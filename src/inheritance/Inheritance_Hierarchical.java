
package inhertance;

public class Father 
{
	public void money()
	{
		System.out.println("Fathers money");
	}
	
	public void care()
	{
		System.out.println("Fathers care");
	}

}

/// this is 2nd program for this



package inhertance;

public class Child1 extends Father 
{
	public void mobile()
	{
		System.out.println("Child1's mobile");
		
	}

}



//this is 3rd program


package inhertance;

public class Child2 extends Father
{
	public void laptop()
	{
		System.out.println("Child2's laptop");
	}

}


//this is 4th program



package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
	
		Child2 c2=new Child2();
		c2.care();
		c2.money();
		c2.laptop();
	
		Child1 c1= new Child1();
		c1.care();
		c1.money();
		c1.mobile();

	}

}