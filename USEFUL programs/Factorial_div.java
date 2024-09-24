package questions;
import java.util.Scanner;
public class Factorial_div {

	public static void main(String[] args)
	{
		int n,a=1,c;
		float sum=0 ,fact=1;
		System.out.println("\n what is range of numbers you wanna to print /n");
		Scanner t =new Scanner(System.in);
		n=t.nextInt();
		
		System.out.println("\n your favourable outcomes are : \n");
		//while(a <= n)
		//{
			//fact=1;
		//	for(c=1;c<=a;c++)
		//	{
	//			fact =fact*c ;
		//	}
			
	//		sum = sum+(a/fact) ;
//			
	//		a++;
		//}
	//	 System.out.println("\n factorial is : " +fact);
		// System.out.println( "\n required calculation is :" +sum);
         
         for(c=1;c<=n;c++)
         {
        	 fact = fact*c ;
        	 sum = sum +(c/fact);
         }
         System.out.println( "\n required calculation is :" +sum);
	}

}
