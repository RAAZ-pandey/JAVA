package exception;

public class Question8 {

	public static void main(String[] args)
	{
		try
		{
			int x=0;
			int y = 5/x;
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
		//catch(ArithmeticException ae)  child class cant be used after parent exception class 
		{
			System.out.println(" Arithmetic exception");
		}
		System.out.println("finished");

	}

}
