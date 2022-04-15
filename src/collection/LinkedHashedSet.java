
package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet<>();
		
		lh.add("Test");
		lh.add("Test");
		lh.add(null);
		lh.add(null);
		lh.add(12);
		lh.add(23);
		
		System.out.println(lh);
		

	}

}
