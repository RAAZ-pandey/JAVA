package questions;

import java.util.*;
public class Vowel_check {

	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter one  string of your choice ");
		String s = t.next();
		int count =0 ;
		
	   s=s.toLowerCase();
	   
	   for(int i=0;i<s.length();i++)
	   {
		 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		 {
			 count++;
		 }
	   }
	   System.out.println("total numbers of vowels are : " +count);
	   
	   
	}

}
