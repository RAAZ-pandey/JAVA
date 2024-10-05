package questions;

import java.util.Scanner;

public class Square_plus1 {
	public static void main(String [] args)
	{
		int i,n,sum=0;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println(" \n your favourable outcome is : \n");
		
		for(i=1;i<=n;i++)
		{
			sum=i*i+1 ;
			System.out.println(sum);
		}
	}

}
