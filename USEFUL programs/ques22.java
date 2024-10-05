package questions;

import java.util.Scanner;

public class ques22 {

	public static void main(String[] args)
	{
		int n ,i;
		double sum=0.0;
		System.out.println("\n what is range of numbers you wanna to print ");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();

		for(i=1;i<n;i++)
		{
			  
			sum+=(double)i/(i+1);
			
		}
		
		System.out.print(" your sum is : "+sum); 
	}

}
