package problems;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("\n Enter your string \n");
		String a=t.next();
		
		int p =a.length()-1;
		char m[] = a.toCharArray();
		int i;
		
		for(i=0;i<p;i++)
		{
			if(m[i]!=m[p])
			{
				break ;
			}
			p-- ;
		}
		if(i<p)
			System.out.println("nhi hai bhai palindrome");
		else
			System.out.println("palindrome string  hai aur kya");
	}

}
