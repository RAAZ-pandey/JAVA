package questions;
import java.util.*;
public class Adding_integer {

	public static void main(String[] args)
	{
		int i,n,num = 1;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println(" numbers after adding integers \n");
		
		 for(i=0;i<=n;i++)
		 {
			 num = num+i;
			 System.out.println(num);
		 }

	}

}
