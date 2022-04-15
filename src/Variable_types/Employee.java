
package Variable_types;

public class Employee {
	
	
	//name
	//emp_id
	//Dept
	//sal
	//poisition T, D, M, S
	static String team="INDIA";
	String Emp_name;//global variable declaration
	int Emp_id;
	String Emp_dept;
	float Emp_sal;
	char Emp_Position;
	

	public static void main(String[] args)
	{
		

	}
	
	public void emp_info()
	{
		System.out.println("==========================================");
		System.out.println("Emp Team  is "+team);
		System.out.println("Emp name is "+Emp_name);
		System.out.println("Emp id is "+Emp_id);
		System.out.println("Emp dept is "+Emp_dept);
		System.out.println("Emp salary is "+Emp_sal);
		System.out.println("Emp position is "+Emp_Position);
		System.out.println("==========================================");
	}

	
	
}

