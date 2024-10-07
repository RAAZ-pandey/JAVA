package Handling;

public class Catch {

	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println(" Result is " +(a/b)); 
			
		}catch(ArithmeticException  e1)             // inputs can be 8/0
		{
			System.out.println(e1);             
		}
		catch(ArrayIndexOutOfBoundsException e1)        // inputs can be 5/a
		{
			System.out.println(e1);
		}
		catch(Exception e)                           // a=8 , don't take any value for b 
		{
			System.out.println(e);
		}
	}

}
