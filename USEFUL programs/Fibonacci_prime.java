package questions;
import java.util.*;
public class Fibonacci_prime {

	public static void main(String[] args)
	{
		int i,j,n,p=0,q=1,c,k=0;
		System.err.println(" enter range of finonacci");
		Scanner t =new Scanner (System.in);
		n=t.nextInt();
		
		
		System.out.println(p);
		System.out.println(q);
		
		for(i=3;i<n;i++)
		{
			c=p+q;
			k=0;
			for(j=2;j<c;j++)
			{
				if(c%j==0)
					
				{
					k=1;
					break;
				}
			}
			if(k==0)
				System.out.print(" "+c);
			p=q;
			q=c;
		}

	}

}
