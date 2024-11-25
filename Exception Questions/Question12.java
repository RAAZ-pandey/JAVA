package exception;

public class Question12 {

public static void amethod() throws Exception
{
	try
	{
		throw new Exception();
	}
	finally
	{
		System.out.println("finally");
	}
}
	public static void main(String[] args) 
	{
	  	try
	  	{
	  		amethod();
	  	}
          catch(Exception e) 
	  	{
        	System.out.println("exception");  
        }
	  	System.out.println("finished");
	}

}
