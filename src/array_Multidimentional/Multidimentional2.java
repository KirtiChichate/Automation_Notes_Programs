
package array_Multidimentional;

public class Multidimentional2 {

	public static void main(String[] args) {
		
		//1.2--> declaration+ initialization
		char ar[][]= {{'a','b'},{'c','d'}};
		
		
		//3.usage
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=0;j<=ar.length-1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
