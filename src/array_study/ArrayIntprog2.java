
package array_study;

import java.util.Arrays;

public class ArrayIntprog2 {

	public static void main(String[] args) {
		
		
		int money[]= {22,99,88,11,44};
		
		System.out.println("==========Printing value as it is=========");
		for(int i=0;i<=money.length-1;i++)
		{
			System.out.println(money[i]);
		}
		
		System.out.println("==========Printing value in reverse order=========");
//		
//		for(int i=money.length-1;i>=0;i--)
//		{
//			System.out.println(money[i]);
//		}
//		
		System.out.println("===Printing Acsending value===========");
		Arrays.sort(money);
		for(int i=0;i<=money.length-1;i++)
		{
			System.out.println(money[i]);
		}
		
		System.out.println("===Printing descending value===========");
		for(int i=money.length-1;i>=0;i--)
			{
				System.out.println(money[i]);
			}
		
	}

}