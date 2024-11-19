package Handling;

public class Throw {

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		
		if(a==5||a==10)
		{
			throw new ArithmeticException("galat number hai bhaiya");
		     
		}
		else
		{
			System.out.println("sab thike baa");
		     System.out.println("normal flow");
		    
		}
		}

}
