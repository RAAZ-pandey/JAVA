package Handling;

public class Multiple_try {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Hiiii");
            
			try
			{
				System.out.println("  division  time bro ");
				System.out.println(4/0);
			}
			
			catch(ArithmeticException e)
			{
				System.out.println( " division error ");
			}
			try
			{
				int a[] =new int[5] ;
				a[5] = 7 ;
			}
			
				
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(" range k bahar hai ");
				}
		    }
				catch(Exception e)
				{
					System.out.println( " Handle ho jayega ");
				}
		
			
				System.out.println(" khatam tata bye bye ");		
				
		}
		
		
	
	}


