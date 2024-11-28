package String_ques;
import java.util.*;
public class Reverse_string {

	public static void main(String[] args)
	{
		String s , revs = null ;
		char ch ;
		Scanner t = new Scanner(System.in);
		System.out.println(" enter your favourable string \n");
		s=t.next();
		
		
			//for(int i=s.length();i>0;i--)
				for(int i=0;i<s.length();i++)
			{
				//System.out.print(s.charAt(i-1));  // created by youtubers,,,,
				ch = s.charAt(i);
				revs = ch+revs ;   
				
			}
			
		System.out.println( "reversed string is : " +revs);

	}

}
