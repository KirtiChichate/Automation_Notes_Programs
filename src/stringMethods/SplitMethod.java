
package stringMethods;

public class SplitMethod
{
String o = "I_love_my_India";
		String refo="_";
		
		String[] output2 = o.split(refo);
		
		for(int i=0;i<=output2.length-1;i++)
		{
			System.out.println(output2[i]);
		}
}