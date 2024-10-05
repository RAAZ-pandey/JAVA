package questions;

import java.util.Scanner;

public class Sum_digits24 {

	public static void main(String[] args)
	{
		int n,r=0,sum=0;
		System.out.println("\n Enter a number you wanna reverse /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		
		while(n>0)
		{
			r=n%10 ;
			sum=sum+r;
			n=n/10 ;
			
		}
		System.out.print(" sum of digits of given number is : "+sum);
	}

}
