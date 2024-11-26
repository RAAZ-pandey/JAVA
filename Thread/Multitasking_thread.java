package thread_demo;
class UT1 extends Thread
{
	public void run()
	{
		System.out.println("jammu kashmir hmara hai");
	}
}
class UT9 extends Thread
{
	public void run()
	{
		System.out.println("Article 370 ka hatna jaruri hai");
	}
}
class UT3 extends Thread
{
	public void run()
	{
		System.out.println("jaan de denge iske liye ");
	}
}
public class Multitasking_thread //while achieving multitasking in thread each class runs at the same time so outputs can vary on several times
{

	public static void main(String[] args) 
	{
	   UT1 s1 =new UT1();
	   UT9 s2 = new UT9();
	   UT3 s3 = new UT3();
	   
	   s1.start();
	   s2.start();
	   s3.start();
	   

	}

}
