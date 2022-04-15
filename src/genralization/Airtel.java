
package genralization;

public class Airtel implements TRAI{

	@Override
	public void call() {
		System.out.println("0.5rs/min");		
	}

	@Override
	public void msg() {
		System.out.println("150msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("1.5GB/day");
		
	}
	public void NewMethod_Airtel()
	{
		System.out.println("Aritel new Method");
	}
	

}
