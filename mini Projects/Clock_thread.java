package project;
import java.util.Scanner;

class Clock1
{
	Scanner t = new Scanner(System.in);
	int h ,m ,s,j;
	public Clock1()
	{
		System.out.println("enter current timings : ");
		
		int h = t.nextInt();
		int m = t.nextInt();
		int s = t.nextInt();
	}
	
	public synchronized void second() 
	{
	   j=s ;
	   try {
		   for(int i=j ;i<=58;i++)
		   {
			   s+=1;
			   System.out.println(h +":"+ m + ":"+ s);
			   Thread.sleep(1000);
		   }
		   if(s==59 && m<=58)
		   {
			   m+=1;
			   s=00;
			   System.out.println(h +":"+ m + ":"+ s);
	        }
		   
	   }catch(Exception e)
	   {
		 System.out.println(e);  
	   }
	}
	
	public  synchronized void minute()
	{
		try {
			
		
		if(m==60)
		{
			h+=1;
			m=00;
			//s=00;
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public synchronized void hour()
	{
		try {
			if(h==12)
			{
				h=00;
				m=00;
				s=00;
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
 class second extends Thread
 {
	 Clock1 c;
	 public second(Clock1 c)
	 {
		 this.c=c;
	 }
	 public void run()
	 {
		 c.second();
	 }
 }
class minute extends Thread
{
	Clock1 c;
	public minute(Clock1 c)
	{
		this.c=c;
	}
	public void run()
	{
		c.minute();
	}
}

class hour extends Thread
{
	Clock1 c;
	public hour(Clock1 c)
	{
		this.c=c;
	}
	public void run()
	{
		c.hour();
	}
}
public class Clock_thread {

	 public static void main(String[] args)
	 {
		 
	 }
}
