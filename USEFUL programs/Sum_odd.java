package questions;

import java.util.Scanner;

public class Sum_odd {

	public static void main(String[] args)
	{
		int i,n,sum=0;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println("\n ODD NUMBERS BETWEEN GIVEN RANGE IS");
		
		
		for(i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
			   System.out.println(i);
			   sum=sum+i ;
			}
		}
		System.out.println("\n sum of all odd numbers between is : " +sum);

	}

}
