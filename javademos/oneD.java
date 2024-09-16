package javademos;
import java.util.Scanner;

public class oneD
  {
	public static void main(String[] args)
	 {
	   Scanner p=new Scanner(System.in);
	   System.out.println("enter range");
	   
	   int n=p.nextInt();
	   int [] a1=new int[n];
	   
	   System.out.println("enter data in array");
	    for(int i=0; i<n; ++i)
	    	a1[i]=p.nextInt();
	    System.out.println("my data in reverse order");
	      for(int i=n-1;i>=0;i--)
	    	  System.out.println(a1[i]);
	      
	 }

}
