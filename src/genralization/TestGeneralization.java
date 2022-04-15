
package genralization;

public class TestGeneralization {

	public static void main(String[] args) {
		Jio j= new Jio();
		System.out.println("======JIO=========");
		j.call();
		j.msg();
		j.data();
		j.NewMethod_Jio();
		System.out.println("======JIO=========");
		
		Airtel A= new Airtel();
		System.out.println("======AIRTEL=========");
		A.call();
		A.msg();
		A.data();
		A.NewMethod_Airtel();
		System.out.println("======AIRTEL=========");
		
		Vi v= new Vi();
		System.out.println("======VI=========");
		v.call();
		v.msg();
		v.data();
		v.NewMethod_VI();
		System.out.println("======VI=========");
		
		

	}

}
