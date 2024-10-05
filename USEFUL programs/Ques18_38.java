package questions;
import java.util.Scanner;
public class Ques18_38 {

	public static void main(String[] args)
	{
		int n,i,num=2;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println("\n your favourable outcome is : \n ");  
		for(i=1;i<=n;i++)    
		{
			
			System.out.println(num);
			num=num*2-1;
			
		}
          
	}

}
