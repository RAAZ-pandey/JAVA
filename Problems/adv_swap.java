package problems;
import java.util.Scanner;    

public class adv_swap {
	public static void main(String args[])
	{
		int a,b;
		Scanner t=new Scanner(System.in);
		System.out.println("\n enter two numbers \n");
		a=t.nextInt();
		b=t.nextInt();
		
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println( "after swapping a =" +a);
		System.out.println("after swapping  b="  +b);
		
	}

}
