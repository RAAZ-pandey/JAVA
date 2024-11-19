package Handling;

public class What_need {

	public static void main(String[] args)
	{
		int a =Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		
		System.out.println(" Reasult is  " +a/b);  //if we divide any number by zero them it break the  normal flow of this program 
		System.out.println("noramal flow continues");  // so we need exception to be handled  for printing this statement 

	}

}
