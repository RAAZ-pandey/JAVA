package questions;

import java.util.Scanner;

public class Polyndrome_chec {

	public static void main(String[] args) 
	{  

		int n,c,r=0,num=0;
		System.out.println("\n Enter a number of your choice /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		c = n ;
		while(n>0)
		{
			r=n%10 ;
			num=(num*10)+r;
			n=n/10 ;
			
		}
		 if(c==num)
		 {
			 System.out.println(" palindeome number hai veere");
		 }
		 else   
		 { 
			System.out.println("kya kar rha bhai tu ");
		 } 

	}

}
