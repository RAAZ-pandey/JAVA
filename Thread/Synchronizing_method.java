package thread_demo;

class Tabele
{
	public synchronized void Printtable(int n)
	{
		System.out.println("\n printing table in order");
		for(int i=0;i<=10;i++)
		{
			System.out.print("\t" +(n*i));
			try
			{
				Thread.sleep(2000);
			}catch(Exception e)
			{
				
			}
		}
	}
}
class thread1 extends Thread
{
	Tabele t ;
	public thread1(Tabele t)
	{
		this.t=t;
	}
	public void run()
	{		
			t.Printtable(9);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
class thread2 extends Thread
{
	Tabele t;
	public thread2 (Tabele t)
	{
		try
		{
			t.Printtable(6);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}
}
public class Synchronizing_method {

	public static void main(String[] args) 
	{
		Tabele ta =new Tabele();
		thread1 x1 = new thread1(ta);
        thread2 x2 = new thread2(ta);
        
        x1.start();
        x2.start();
	}

}
