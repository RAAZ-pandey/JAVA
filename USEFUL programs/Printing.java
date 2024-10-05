package questions;
import java.util.*;
public class Printing {

	public static void main(String[] args)
	{
		int i,n,x;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		for(i=1;i<=n;i++)
		{
		   System.out.println(i);
		}
		
		System.out.println("/n numbers in reverse order \n");
		
		for(i=n;i>=1;i--)
		{
			System.out.println("\t" +i);
		}
		
	}

}
