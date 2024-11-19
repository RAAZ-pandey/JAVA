package Handling;

public class Throw_Factorail {

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		
		if(a%5==0)
		{
			throw new ArithmeticException("galat number haain");			
		}
		else
		{
			System.out.println("sab thik hai");
			System.out.println(" normal flow ");
		}
		

	}

}
