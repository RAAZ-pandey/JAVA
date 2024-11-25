package exception;

public class Question14 {

	public static void main(String[] args)
	{
		try
		{
			badmethod();
			System.out.println("A");
		}
		catch(Exception ex)
		{
			System.out.println("B");
		}
        finally
        {
        	System.out.println("C");
        }
		System.out.println("D");
	}
 public static void badmethod()
 {
	 throw new RuntimeException();
 }
}
