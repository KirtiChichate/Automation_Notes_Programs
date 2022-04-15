
package inhertance;

public class MultiLevelIneritance {

	public static void main(String[] args) 
	{
		Daughter d= new Daughter();
		d.stories();// method from supermost class
		d.look();// method form super class
		d.money();// method form super class
		d.mobile();//method form sub class
		Daughter.nature();//method from Super class
		Daughter.scooty();//sub class

	}

}

