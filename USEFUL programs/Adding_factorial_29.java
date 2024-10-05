package questions;

import java.util.Scanner;

public class Adding_factorial_29 {

	public static void main(String[] args)
	{
		int n,i,a=1,c;
		float fact=0,sum=0;
		System.out.println(" \n enter nummber of your choice \n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		
		

		System.out.println("\n your favourable outcomes are : ");
		while(a <= n)
		{
			fact=1;
			for(c=2;c<=a;c++)
			{
				fact =fact*c ;
			}
			
			sum = sum+(a/fact) ;
			
			a++;
		}
		//System.out.println(" Factorial of numbers are : " +fact);
		System.out.println( " \n sum of 1/2! +2/3! + 3/4! ......n   is : "+sum);

	}

}
