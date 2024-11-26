package thread_demo;

class Tabele1
{
	public  void Printtable(int n)
	{
		synchronized (this)
	{
		System.out.println("printing table in order");
		for(int i=0;i<=10;i++)
		{
			System.out.print("\t" +n*i);
			try
			{
				Thread.sleep(2000);
			}catch(Exception e)
			{
				
			}
		}
	}
}
}
class thread4 extends Thread
{
	Tabele1 t ;
	public thread4(Tabele1 t)
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
class thread3 extends Thread
{
	Tabele1 t;
	public thread3(Tabele1 t)
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
public class Synchronized_block {

	public static void main(String[] args) 
	{
      Tabele1 ta = new Tabele1();
      thread4 m1 = new thread4(ta);
	   thread3 m2 = new thread3(ta);
	   
	   m1.start();
	   m2.start();
	}

}
