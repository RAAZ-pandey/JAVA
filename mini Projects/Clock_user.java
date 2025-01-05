package project;
import java.util.*;



public class Clock_user {

	public static void main(String[] args) 
	{
		Scanner t = new Scanner(System.in);
		System.out.println("enter current timings");
	   int hour = t.nextInt();
	   int min = t.nextInt();
	   int sec = t.nextInt();
	   
	   try {
		   while(true)
		   {
			   
		      System.out.printf("%02d : %02d :%02d", hour,min,sec);
		      System.out.println();
		      sec++;
		      
		      if(sec == 60)
		      {
		    	  min += 1;
		    	  sec = 0;
		      }
		      
		      if(min == 60)
		      {
		    	  hour += 1;
		    	  min = 0 ;
		      }
		      
		      if(hour == 12)
		      {
		    	  hour = 0;
		    	  min = 0;
		    	  sec = 0;
		      }
		      
		      Thread.sleep(1000);
		   }
	   }catch(Exception e) 
	   {
		   System.out.println(e);
	   }

	}

}
