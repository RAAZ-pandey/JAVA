package questions;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args)
	{
		int i,j,n,k=0;
		System.out.println(" \n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println(" prime numbers  are :");
		
		for(i=1;i<=n;i++)
		{
			k=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
				k=1;
				break ;
				}
			}
			
			if(k==0)
			{
				System.out.print(" " +i);
			}
		}

	}

}
