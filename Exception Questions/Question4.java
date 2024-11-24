package exception;



	
public class Question4 {
	void show(int a)throws MyException
	{
		System.out.println("Hello custom exception");
		int b=a/0 ;
	}


	public static void main(String[] args) throws MyException
	{
		Question4 obj = new Question4();
		obj.show(5);
		System.out.println(" bye custom exception ");

	}
}
 class MyException extends Exception
 {
	 MyException()
	 {
		 super();
	 }
	 MyException(String name)
	 {
		 super(name);
	 }
 }
