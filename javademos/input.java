package javademos;
import java.util.Scanner;

public class input
 {
	
	public static void main(String[] args) 
	 {
		Scanner t = new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int a=t.nextInt();
		int b=t.nextInt();
		System.out.println("addition is  "+(a+b));
		System.out.println("enter name");
		String s1=t.next();
		System.out.println("welcome " +s1);

	}

}
