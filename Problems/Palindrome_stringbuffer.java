package problems;
import java.util.*;
public class Palindrome_stringbuffer {

	public static void main(String[] args)
	{
		//StringBuffer s1 = new StringBuffer(" Reviver");
		Scanner t = new Scanner(System.in);
		System.out.println("Enter string of your choice \n");
		StringBuffer s1 =new StringBuffer(t.next());
		StringBuffer s2 = new StringBuffer (s1).reverse();
		String s3 = s2.toString();
		String s4 = s1.toString();
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		if(s3.equals(s4))
       
        	 System.out.println("\n palimdrome hai bhai"); 
          
		else
			System.out.println("\n nahi hai bhai palindrome");

	}

}
