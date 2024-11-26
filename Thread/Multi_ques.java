package thread_demo;



import java.util.*;


class Fact extends Thread
{
	public void run()
	{
      int fact=1;
      for(int i=1;i<=6;i++)
      {
    	  fact =fact*i ;
      }
      System.out.println("factorial is : " +fact);
	}
}

class Factor extends Thread 
{
	public void run()
	{
	   Scanner t = new Scanner(System.in);
		int a= t.nextInt();
		
		if(a%3==0)
		{
			System.out.println(" it ius a factor of 3");
		}
		else
		{
			System.out.println("naah its not");
		}
	}
}

public class Multi_ques {

	public static void main(String[] args) 
	{
		Scanner t= new Scanner(System.in);
		int a = t.nextInt();
        Fact s1 = new Fact();
        Factor s2 = new Factor();
        s1.start();
        s2.start();
	}

}
