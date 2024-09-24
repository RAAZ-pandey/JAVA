package questions;
import java.util.*;
public class Fibonacci_sum {

	public static void main(String[] args)
	{
		int i,n,p=0,q=1,c=0,sum=0;
		System.out.println("enter range of fibonnaci series");
		Scanner t =new Scanner (System.in);
		n=t.nextInt();
		
		
		System.out.println(p);
		System.out.println(q);
		
		for(i=1;i<n;i++)
		{
			c=p+q;
			p=q;
			q=c;
			System.out.print(" "+c);
			
			sum+=c;
		}
		System.out.println(" ");
         System.out.println("  sum of given fibonacci is : " +sum);
	}

}
