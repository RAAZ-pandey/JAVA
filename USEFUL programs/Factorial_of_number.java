package questions;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args)
	{
		int i,a,fact=1;
		System.out.println(" \n enter nummber of your choice \n");
		Scanner t =new Scanner(System.in);
		a=t.nextInt();
		
		for(i=1;i<=a;i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);

	}

}
