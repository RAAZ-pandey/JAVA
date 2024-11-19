package Handling;

import java.util.*;

public class Divide {
	
	public static int divide(int x , int y)
	{
		try
		{
			return x/y ;
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught in divide , rethrowing......");
			throw(e);
			
		}
	}

	public static void main(String[] args)
	{
		try
		{
			Scanner t =new Scanner(System.in);
			System.out.println("enter two  number ");
			
			int a =t.nextInt();
			int b = t.nextInt();
			int c = divide(a, b);
			
			System.out.println("RESULT IS : " +c);
					
		}catch(Exception e)
		  {
			System.out.println("Exception hai bhaiya ye to");
			System.out.println(e);
		
		    }
            System.out.println("normal flow remains : ^^^^");
	}

}
