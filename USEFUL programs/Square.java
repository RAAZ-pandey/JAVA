package questions;

import java.util.Scanner;

public class Square {

	public static void main(String[] args)
	{
		int i,n,s=0 ,sum=0;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		for(i=1;i<=n;i++)
		{
			s=i*i;
		
		System.out.println("square of given numbers is : " +s);
		
		  sum=sum+s;
		}
		System.out.println(" \n sum of square of all numbers is : "  +sum);

	}

}
