package questions;

import java.util.Scanner;

public class Add_without_operator {

	public static void main(String[] args)
	{
		int a,b,temp;
		System.out.println("\n write a number you wanna check /n");
		Scanner t =new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
		
		for(int i=0;i<b;i++)  //ye mera wla hai
	  {
	        a++ ;
		
		}
	//while(b!=0)	{             //youtube ka choda 
		//temp = a&b;
		//a=a^b;
	    //b=temp<<1; }
	
	
	System.out.println(a);
	}
}
