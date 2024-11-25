package exception;

public class Question16 {

	public static void main(String[] args)
	{
	try
	{
      System.out.println("A");
       int num = 99/0  ;
       System.out.println("B");
	}
	finally
	{
	  System.out.println("C");	
	}
	System.out.println("D");
	}

}
