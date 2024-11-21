package problems;
import java.util.Scanner;
public class swapping
  {
	public static void main(String[] args)
	{
		//int a=9,b=0,temp;                        
		int a,b,temp;
		Scanner t=new Scanner(System.in);                 // by user defined method
		System.out.println("\n enter two numbers  numbers");
		a=t.nextInt();
		b=t.nextInt();
		  temp=a;
		  a=b;
		  b=temp;
		  
		  System.out.println("after swapping  a= " +a    );
		  System.out.println("b= "  +b);
	
	
	
		}	

	}


