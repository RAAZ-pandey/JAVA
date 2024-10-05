package questions;

import java.util.Scanner;

public  class Sum_of_factorial {

	public static void main(String[] args)
	{
		int i,j,n,c,fact=1,sum=0 ;
		System.out.println(" \n enter nummber of your choice \n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i ;
			sum=sum+fact ;
			System.out.println(fact);
		}
		
        System.out.print(" sum os specific factorials is  :  "  +sum);
	}

}
