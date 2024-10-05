package questions;

import java.util.Scanner;

public class Frequent_add_sub {

	public static void main(String[] args)
	{
		int i,j = 0,n,sum=0;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum-i;
			}
			else
			{
				sum=sum+i;
			}
		
		}
		System.out.println(" \n your favourable outcome is : \n ");
		
			System.out.println( sum);
		}

	

}
