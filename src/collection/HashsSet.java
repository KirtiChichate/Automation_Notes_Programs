
package collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
	
		HashSet hs= new HashSet<>();
		
		hs.add("Pune");
		hs.add("Velocity");
		hs.add("test");
		hs.add("test");
		hs.add(null);
		hs.add(null);
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		

	}

}
