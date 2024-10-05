package questions;

import java.util.Scanner;

public class Ques39 {                     //1  2  2  4  8  32  256 
	
	public static void main(String[] args)
	{
	    int n, a=1 ,b=2 ,mul=0 ;
	    System.out.println(" \n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
	    
		
		System.out.println(" favourable outcomes are ");
		System.out.print(" "+a);
		System.out.print(" "+b);
		
		
	     for(int i=0;i<=n;i++)
	    {
	    	mul = a*b ;
	    	a=b ;
	    	b = mul ;
	    	
	      	System.out.print(" " +mul);
	    }

	}

}
