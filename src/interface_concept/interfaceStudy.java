package interface_study;

public interface Father {
	
	void money();
	void rules();
	//this is complete method, we need to change it to default while adding body
	default void love()
	{
		System.out.println("fathers love");
	}
	
	static void nature()
	{
		System.out.println("fathers nature");
	}
	

}