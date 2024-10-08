package Handling;

public class Trycatch_1 {

	public static void main(String[] args) 
	{
	   System.out.println("1");
	   int a=7 ,b=0 ,c;
	   System.out.println("2");
	   try
	   {
		   System.out.println("3");
		   c=a/b;
		   System.out.println("4");
		   System.out.println("5");
	   }catch(ArithmeticException e)
	   {
		   System.out.println("6");
		   System.out.println("galat baat hai bhai");
		   System.out.println(e);
		   System.out.println("hello beti");
	   }
		System.out.println("chala jaa");
	}

}
