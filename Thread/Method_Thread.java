package thread_demo;

class Userthread extends Thread 
{
	public Userthread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println("run is completed");
			}
		}
	}
}
public class Method_Thread {

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
       System.out.println(" main method is invoked by " + t.getName() +"thread");
       
       Userthread th1 = new Userthread("thread1");
       Userthread th2 = new Userthread("thread2");
       
       System.out.println("invoking run()...........");
       
  //   th1.run();  // as a simple run method 
       th1.start();
       th2.start();  // both times invoked as thread
       
       for(int i=0;i<=10;i++)
       {
    	   System.out.print(i);
    	   try {
    		   Thread.sleep(1000);
    	   }catch(Exception e)
    	   {
    		   System.out.println(e);
    	   }
       }
       
	}

}
