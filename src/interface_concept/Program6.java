
package interface_study;

public class Myclass implements Interface2{

	public static void main(String[] args) {
		Myclass m= new Myclass();
		m.m1();
		m.m2();
		m.m3();
		m.m4();
	}

	@Override
	public void m1() {
	System.out.println("Methof from Interface 1 completed in Implementation class");
		
	}

	@Override
	public void m2() {
		System.out.println("Methof from Interface 1 completed in Implementation class");
		
	}

	@Override
	public void m3() {
		System.out.println("Methof from Interface 2 completed in Implementation class");
	}

	@Override
	public void m4() {
		System.out.println("Methof from Interface 2 completed in Implementation class");
		
	}

}
