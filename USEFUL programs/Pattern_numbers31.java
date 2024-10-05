package questions;

import java.util.Scanner;

public class Pattern_numbers31 {

	public static void main(String[] args)
	{
		int i,j,a=1,n;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(a);
			}
			System.out.print("\n");
		}

	}

}
