package questions;

import java.util.Scanner;

public class Sum_primenumbers {

	public static void main(String[] args) 
	{
		int i,j,n,k=0,sum=0;
		System.out.println("\n what is range of numbers you wanna to print \n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println("\n prime numbers between given range are : \n");
		for(i=1;i<=n;i++)
		{
			k=0;
			for(j=2;j<i;j++)
			{
			   if(i%j==0)
			   {
				   k++ ;
				   break ;
			   }
			}
			if(k==0 )
			{
				System.out.print(" "+i);
				sum+=i ;

			}
			
		}
	    
	    System.out.println(" \n  addition of all prime numbers between  is : "+sum);

	}

}
