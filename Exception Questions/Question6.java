package exception;

public class Question6 {

	 static void show()
	{
		try {
			System.out.println("inside try");
			return ;
		}
		finally
		{
			System.out.println("inside finally");
		}
	}
	public static void main(String[] args)
	{
		show();

	}

}
