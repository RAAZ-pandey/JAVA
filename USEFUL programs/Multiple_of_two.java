package questions;
import java.util.*;
public class Multiple_of_two {

	public static void main(String[] args)
	{
		int i,n,sum=1;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println("multiple of two are \n ");
		
		for(i=2;i<=n;i++)
		{
			sum=sum*2;
			System.out.println(sum);
		}

	}

}
