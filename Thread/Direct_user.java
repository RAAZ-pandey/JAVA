package thread_demo;

class UT implements Runnable
{
	static
	{
		Thread t = Thread.currentThread();
		System.out.println("name of current thread "+t.getName());
	}
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("name of thread" +t.getName());
	}
}

public class Direct_user {

	public static void main(String[] args)
	{
	  UT x = new UT();
	  Thread t1 =new Thread(x);
	  t1.start();

	}

}
