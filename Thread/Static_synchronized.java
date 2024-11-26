package thread_demo;


class Table1
{
	public static synchronized void printtable(int n)
	{
		System.out.println("initaite printing.......");
		for(int i=1;i<=10;i++)
		{
			System.out.print("\t" +n*i);
			try {
				Thread.sleep(2000);
			}catch(Exception e)
			{}  
			}
		}      }
class Nhread01 extends Thread
{
	Table1 p ;
	public Nhread01(Table1 t)
	{
		this.p = p;
	}
	public void run()
	{
		try {
			Table1.printtable(6);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}
}
class Nhread02 extends Thread
{
	Table1 p ;
	public Nhread02(Table1 t)
	{
		this.p = p;
	}
	public void run()
	{
		try {
			Table1.printtable(7);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}
}
class Nhread03 extends Thread
{
	Table1 p ;
	public Nhread03(Table1 t)
	{
		this.p = p;
	}
	public void run()
	{
		try {
			Table1.printtable(8);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}
}
class Nhread04 extends Thread
{
	Table1 p ;
	public Nhread04(Table1 t)
	{
		this.p = p;
	}
	public void run()
	{
		try {
			Table1.printtable(9);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}
}
public class Static_synchronized {

	public static void main(String[] args)
	{
		Table1 ta = new Table1();
		Table1 tz = new Table1();
		
		Nhread01 t1 = new Nhread01(ta);
		Nhread02 t2 = new Nhread02(ta);
        Nhread03 t3 = new Nhread03(tz);
        Nhread04 t4 = new Nhread04(tz);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
	}

}
