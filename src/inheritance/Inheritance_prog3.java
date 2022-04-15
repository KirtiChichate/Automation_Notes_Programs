
package inhertance;

public class SingleLevelStudy {

	public static void main(String[] args) 
	{
		Mother m= new Mother();// created object of mother class
		m.money();//calling non static methods of mother class
		m.look();// calling non static methods of mother class
		
		//inheritance
		 Daughter d= new Daughter();// created object of Daughter class
		 
		 d.look();//calling super class Non static property using subclass object
		 d.money();//calling super class Non static property using subclass object
		 d.mobile();//calling same classNon static property 
		 d.scooty();
		
		Daughter.nature();// calling static method form Super class using subclass name
		Daughter.scooty();// calling static method form same class 
	
	}

}
