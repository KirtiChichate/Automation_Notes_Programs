
package Variable_types;

public class HR_Portal {

	public static void main(String[] args) 
	{
		Employee Sachin= new Employee();
		
		Sachin.Emp_name="Sachin T";
		Sachin.Emp_id=10;
		Sachin.Emp_dept="Indian Cricket Team";
		Sachin.Emp_sal=10000.123f;
		Sachin.Emp_Position='S';
		
		Employee Rohit= new Employee();
		
		Rohit.Emp_name="Rohit S";
		Rohit.Emp_id=45;
		Rohit.Emp_dept="IPL";
		Rohit.Emp_sal=187666.6776f;
		Rohit.Emp_Position='D';
		
		Sachin.emp_info();
		
		Rohit.emp_info();

	}

}

