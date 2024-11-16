package exception;

public class Question3 {

	public static void main(String[] args)
	{
	  try
	  {
		  int a =10/1 ;
		  try
		    {
			  int b = 20/1 ;
		    }
		  catch(Exception e1)
		  {
		    	System.out.println("b=20");
		  }
	  }
		  catch(Exception e2)
		  {
			  System.out.println("a=10");
		  }
	  

	}

}
