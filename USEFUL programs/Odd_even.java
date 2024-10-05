package questions;
import java.util.*;
public class Odd_even {

	public static void main(String[] args)
	{
 		int i,n,x;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		//System.out.println("even numbers are \n" );
		System.out.println("odd numbers are \n" );
		for(i=n;i>=1;i--)                  // for n to 1 numbers
		{
			//if(i%2==0)
			//{
			//	System.out.println(i);
			//}
			
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
			//for(i=0;i<=n;i++)       for 1 to n numbers
			//{
				//if(i%2==0)
				//{
				//	System.out.println(i);
				//}
				
				//if(i%2!=0)
				//{
				//	System.out.println(i);
				//}
		}
	}

}
