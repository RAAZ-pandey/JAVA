package thread_demo;

class Table 
{
	public void printtable(int n)
	{
		System.out.println("PRINT THE TABLE  : ");
		for(int i=1;i<=10;i++)
		{
			
			System.out.print("\t"+n*i);
		}
	}
}

class Mythread extends Thread
{
	Table t;
	public Mythread(Table t)
	{
		this.t = t ;
	}
	public void run()
	{
		try {
			System.out.println("PRINTING 3.......");
			t.printtable(3);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}
}

class Mythread1 extends Thread
{
	Table t ;
	public Mythread1(Table t)
	{
		this.t = t ;
	}
	public void run()
	{
		try {
			System.out.println("PRINTING 5.......");
			t.printtable(5);
			Thread.sleep(2000);
		}catch(Exception  e)
		{
			
		}
	}
}
public class Multithreading_error {

	public static void main(String[] args) 
	{
      Table ta =new Table();
      
		Mythread t1 = new Mythread(ta);
        Mythread1 t2 = new Mythread1(ta);
        
        t1.start();
        t2.start();
	}

}
