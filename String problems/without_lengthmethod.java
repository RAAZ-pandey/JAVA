package String_ques;
import java.util.*;
public class without_lengthmethod {

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		System.out.println("\n Enter your string");
		 String s1 = t.next();
		// String s1 = "india" ;
		int k=0;
		for(char ch : s1.toCharArray())
		{
			k++ ;
		}
		
		System.out.println("\n lenght of given string is " +k);
	}

}
