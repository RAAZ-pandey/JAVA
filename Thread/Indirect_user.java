package thread_demo;

class UT2 extends Thread
{
	public void run()  // run is a predefined method of thread class so we can call it by object 
	{
		System.out.println("task initaited ");
	}
}

public class Indirect_user {

	public static void main(String[] args)
	{
		UT2 s1 = new UT2();
		   s1.start();
//		   s1.man();

	}

}

