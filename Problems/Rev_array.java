package problems;
import java.util.*;
public class Rev_array {

	public static void main(String[] args)
	{
		String rev = "" ;
		Scanner t=new Scanner(System.in);
		System.out.println("\n enter your string \n");
		String s1= t.next();
		
		int l =s1.length()-1;
		char ch[] = s1.toCharArray();
		
		
		for(int i=l;i>=0;i--)
		{
			rev+=ch[i];
		}
		System.out.println(rev);
		
		//return rev ;

	}

}
