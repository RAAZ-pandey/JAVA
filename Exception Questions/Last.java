package exception;

class Test extends Exception{}

public class Last {

	public static void main(String[] args)
	{
     try
     {
    	 throw new Test();
     }catch(Test t)
     {
    	 System.out.println("Got the test Exception");
     }
     finally
     {
    	 System.out.println("inside finally block ");
     }
	}

}
