package exception;

public class Question2 {

	public static void main(String[] args)
	{
	try
	{
		int i ,sum ;
		sum = 10 ;
		for(i=-1;i<3;++i)
		    sum = (sum/i);
	}catch(ArithmeticException e)
	{
		System.out.println("0");
	}
     //  System.out.println(sum);  this will be a compile rime error cz "sum" has an error value
	}

}
