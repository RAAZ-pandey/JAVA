package Handling;

public class Finally {

	public static void main(String[] args) 
	{
		try {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println("result is" +(a/b));
		}
	catch(Exception  e)
	{
	System.out.println(e);	
	}
	
	finally
	{
		System.out.println("finally block");
	}
	
   System.out.println("normal flow");	
	
	   }
}

