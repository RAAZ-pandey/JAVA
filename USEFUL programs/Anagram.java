package questions;

import java.util.Arrays;  //library file to import array methods
import java.util.Scanner;



public class Anagram
{

	public static void main(String[] args) 
	{
		Scanner t =new Scanner(System.in);       //taking input from user
		System.out.println("enter the first string");
		String s1 = t.next() ;
		System.out.println("enter the second string");
		String s2 = t.next() ;
		

		if(s1.length()!= s2.length())              // checking length of both strings 
		 {
			System.out.println("strings are not anagrams.");
			return ;
		 }
		char[] x1 = s1.toCharArray();     //coverting string to character array using method of array
		char[] x2 = s2.toCharArray();
		
		Arrays.sort(x1);          //sorting the character array 
		Arrays.sort(x2);

		
		System.out.println(x1);
		System.out.println(x2);
		if(Arrays.equals(x1,x2))     //Arrays.equals is an method of array class as above i have imported from lib
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not");
		}

	}

}
