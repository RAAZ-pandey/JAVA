package questions;
import java.util.*;
public class Random_ascend_decend {

	public static void main(String[] args)
	{
		     int i,n;
			System.out.println("\n what is range of numbers you wanna to print /n");
			Scanner t =new Scanner(System.in);
			n=t.nextInt();
			
			System.out.println("\n ypur favourable outcome is \n");
			
			for(i=1;i<=n;i++,n--)
			{
			   System.out.println(i);
			   System.out.println(n);
			}

}
}
