

package interface_study;

public interface Mother {
	//this is complete method, we need to change it to default while adding body
	default void love()
	{
		System.out.println("Mothers love");
	}
	void nature();
	
	

}