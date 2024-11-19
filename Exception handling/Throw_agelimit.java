package Handling;

public class Throw_agelimit {

	public static void main(String[] args)
	{
		try 
		{
		int age = Integer.parseInt(args[0]);
		
		if(age<18 )
			throw new ArithmeticException(" underage ho babua ");
		else
			System.out.println(" welcome to PARI BAR : ");
		}catch(ArithmeticException e)
		{
			System.out.println("chala jaa bsdk ");
		}
		System.out.println("normal flow");
		
	}

}
