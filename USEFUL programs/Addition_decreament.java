package questions;

import java.util.Scanner;

public class Addition_decreament {

	public static void main(String[] args)
	{
		int i,n,num=1;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println("your favourable outcome is : ");
		
		for(i=n;i>=1;i--)
		{
			
			System.out.println(num);
			num=num+i ;
		}
	}

}
