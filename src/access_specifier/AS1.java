
package access_specifier;

import access_specifier.AM1;

public class AS1 extends AM1 {

	public static void main(String[] args) 
	{
		AM1 m1= new AM1();// created object of AM1 class
		m1.test1();// can call public members troughout project
		AS1 s1= new AS1();// created object of As1 class
		s1.test2();// calling protected member form another class--> package
		s1.test1();//
		//s1.test3();--> private access modifier--> visible within class so cant use
		//s1.test4();--> default access modifier--> visible within package so cant be used

	}

}

