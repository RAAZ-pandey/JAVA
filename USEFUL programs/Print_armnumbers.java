package questions;
 import java.util.*;
public class Print_armnumbers {

	public static void main(String[] args)
	{
		int n ,i ,num ,r,sum=0 ,k =0;
		System.out.println(" ENTER RANGE YOU WANNA CHECK BETWEEN ");
		Scanner t = new Scanner(System.in);
		n = t.nextInt();
		
		
		for(i=1;i<=n;i++)
		{
			num = i;
			
			while(num>0)
			{

				   r=num%10 ;
				   sum=(r*r*r)+sum ;
				   num=num/10;
				   
			}
			
			if(sum == i)
			{
				System.out.println(i);
			}
			sum=0 ;
		}

	}

}
