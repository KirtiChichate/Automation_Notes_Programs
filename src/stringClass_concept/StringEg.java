
package stringClass_concept;

public class StringEg {

	public static void main(String[] args) {
		
		// without using new keyword
		// String objname="value";---> constant pool area
		// with using new keyword
		// String objname= new String("value")---> non-constant pool area
		
		String s="Velocity";
		String s1= new String ("Corporate");
		
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s.toUpperCase());

	}

}