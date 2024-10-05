package questions;

import java.util.Scanner;

public class Mul_without_operator {

	public static void main(String[] args)
	{
		int a,b,ans=0;
		System.out.println("\n write a number you wanna check /n");
		Scanner t =new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
 
		
		for(int i=0;i<b;i++) {
			
			ans+=a;
		}
		System.out.println(ans);
	}

}
