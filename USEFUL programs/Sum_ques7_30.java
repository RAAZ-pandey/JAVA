package questions;

import java.util.Scanner;

public class Sum_ques7_30 {

	public static void main(String[] args)
	{
		int i,n,sum=0;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(" addition of given numbers is : " +sum);
	}

}
