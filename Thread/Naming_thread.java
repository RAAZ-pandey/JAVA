package thread_demo;

//import java.io.*;
class Threadname extends Thread
{
	Threadname(String threadname)
	{
		super(threadname);
	}
	public void run()
	{
		System.out.println("the thread is executing..........");
	}
}

public class Naming_thread {

	public static void main(String[] args) 
	{
		Threadname th1 = new Threadname("Bharat");
		Threadname th2 = new Threadname("India");
		
		System.out.println("Thread - 1:  " +th1.getName());
        System.out.println("Thread - 2:  " +th2.getName());
        
        th1.start();
        th2.start();
	}

}
