package Handling;

public class Try_catch {
	
	public static void main(String [] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		try{
			System.out.println("result is " +(a/b));
			
		}catch( ArithmeticException e1)
		{
			System.out.println(e1);
		}
		
		System.out.println("normal flow");
	}

}
