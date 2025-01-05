package project;
import java.util.*;

class Bank
{
	Scanner t = new Scanner(System.in);
	int a = 10000;
	public  synchronized void withdraaw()
	{
		System.out.println("Enter your money you to withdraw :- ");
		int cashtodebit = t.nextInt();
		if(a>=cashtodebit)
		{
			a-=cashtodebit;
			System.out.println(cashtodebit +" inr amount has been debited from your account");
			System.out.println("your current balance is : " +a);
		}
		else
		{
			try {
				System.out.println("unable to fetch your transaction kindly wait....");
				wait();
				a-=cashtodebit; 
				System.out.println(cashtodebit +" inr amount has been debited from your account");
				System.out.println("your current balance is : " +a);
			}catch(Exception e)
			{
				System.out.println(e);
			 }
		}
	}
			public synchronized void deposit() {
			System.out.println("enter money you want to credit...");
			int cashtocredit = t.nextInt();
			a+=cashtocredit ;
			System.out.println(cashtocredit +" credited in your account succesfully");
			
			notify();
		
	}
	public synchronized void balancenquiry()
	{
		System.out.println("current balance is : " +a);
	}
}
class credit extends Thread
{
	Bank b;
	public credit(Bank b)
	{
		this.b=b;
	}
	public void run()
	{
	 b.deposit();	
	}
}
class debit extends Thread
{
	Bank b;
	public debit(Bank b)
	{
		this.b=b;
	}
	public void run()
	{
		b.withdraaw();
	}
}

class Inquery extends Thread
{
	Bank b;
	public Inquery(Bank b)
	{
		this.b=b;
	}
	public void run()
	{
		b.balancenquiry();
	}
}

public class Cashflow_bank {

	public static void main(String[] args)
	{
     // Scanner t = new Scanner(System.in);
      Bank b = new Bank();
      credit c = new credit(b);
      debit d = new debit(b);
      Inquery i = new Inquery(b);
      
      
      d.start();
      c.start();
      i.start();
	}

}
