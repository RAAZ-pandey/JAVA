package questions;

import java.util.Scanner;

public class check_aermstrongno {

	public static void main(String[] args)
	{
		int n,r,c,arm=0;
		System.out.println("\n write a number you wanna check /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		
		c=n;
		while(n>0)
		{
		   r=n%10 ;
		   arm=(r*r*r)+arm ;
		   n=n/10;
		}
		
		if(c==arm)
		{
			System.out.println("  given number is a obvious Armstrong >>> ");
		}
		else
		{
			System.out.println(" Armstrong lag nahi rha  ??? ");
		} 
        
	}

}
