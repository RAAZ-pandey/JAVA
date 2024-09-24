package questions;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		int n,r=0, num=0;
		System.out.println("\n Enter a number you wanna reverse /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		
		System.out.println(" your reverse number is : ");
		while (n>0)
	    {
	        r=n%10;
	        System.out.print(r);  // num= num*10+r;
	        n=n/10;

	    }
		
	}

}
