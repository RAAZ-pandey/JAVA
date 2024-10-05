package questions;

import java.util.Scanner;

public class Num_to_string {

	public static void main(String[] args)
	{
		
		int n , num=0 ,r;
		System.out.println(" ENTER THE NUMKBER YOU WANNA  COVERT ");
		Scanner t = new Scanner(System.in);
		n = t.nextInt();
		
		while(n!=0) //425
		{
		 //    	num=(num*10)+(n%10) ;
			
			
		      r = n%10 ;
			num = num *10 +r ;
			n =n/10 ;
			
		} 
		
		while(num!=0)
		{
			switch(num%10)
			{
			case 0 :
				System.out.print("zero ");
				break ;
				
			case 1 :
				System.out.print("one ");
				break ;
				
			case 2 :
				System.out.print("two ");
				break ;
				
			case 3 :
				System.out.print("three ");
				break ;
				
			case 4 :
				System.out.print("four ");
				break ;
				
			case 5 :
				System.out.print("five ");
				break ;
				
			case 6 :
				System.out.print("six ");
				break ;
				
			case 7 :
				System.out.print("seven ");
				break ;
				
			case 8 :
				System.out.print("eight ");
				break ;
				
			case 9 :
				System.out.print("nine ");
				break ;
				
			}
			
			num =num/10 ;
		}
		

	}

}
