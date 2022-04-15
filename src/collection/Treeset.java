
package collection;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet<>();
		
		t.add(123);
		t.add(456);
		t.add(13);
		
		
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.err.println(t.pollLast());
		System.out.println(t);
		System.err.println(t.pollFirst());
		System.out.println(t);
		System.err.println(t.pollFirst());
		
	}

}