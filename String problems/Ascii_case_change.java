package String_ques;
import java.util.*;
public class Ascii_case_change {

	public static void main(String[] args)
	{
		Scanner t =new Scanner(System.in);
		 System.err.println("\n eneter string values \n");
	  //String s = "abcdefgh";
		String s=t.next();
		
		
	 // String s1= "ABCDEFGH";
	  String s1 =t.next();
	  
      char a[] = s.toCharArray();
      char a1[] =s1.toCharArray();
       int   max = a.length ;
       
        /* FOR UPPER CASE  */
      for(int i=0;i<max;i++)
    	  a[i]-=32;
      System.out.println(a);
      
      /* FOR LOWER CASE */
      for(int i=0;i<a1.length;i++)
    	  a1[i]+=32;
      System.out.println(a1);
      
	}  

}
