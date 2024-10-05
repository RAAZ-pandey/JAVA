package questions;
import java.util.*;

public class loop31
{
	public static void main(String args[])
	{
		 int i ,n , j ;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();		
	
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<(i*2);j++)
			{
				System.out.print(j);
				
			}
			System.out.println(" ");
		}
				
		
	}

}
