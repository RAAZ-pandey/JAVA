package Handling;


 class InvalidAge extends Exception
 {
	 public InvalidAge()
	 {
		 super("inappropriate age");
	 }
 }
public class Custom_exception {

	public static void main(String[] args)
	{
		try 
		{
		int age = Integer.parseInt(args[0]);
		
		if(age<18  ||  age >65)
			throw new InvalidAge();
		else
			System.out.println(" welcome to PARI BAR : ");
		}catch(InvalidAge e)
		{
			System.out.println(e);
		}
		System.out.println("normal flow");

	}

}
