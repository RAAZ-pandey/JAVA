package questions;

import java.util.*;
public class Pyramid_numbers {

	public static void main(String[] args) 
	{
	  int n ,k=0 ;	
       Scanner t = new Scanner(System.in);
      n = t.nextInt();
       
       for(int i=1;i<=n;i++ , k=0)
       {
    	   for(int j=1;j<=n-i; j++)
    	   {
    		   System.out.print("  ");
    	   }
    	   while( k!= 2*i-1)
    	   {
    		   System.out.print("* ");
    		   k++;
    	   }
    	   System.out.print("\n");
       }
	}

}
