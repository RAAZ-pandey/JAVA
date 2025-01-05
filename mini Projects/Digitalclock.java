package project;
import java.util.Date;

public class Digitalclock {

	public static void main(String[] args)
	{

		        Thread thread = new Thread(new Runnable() {
		     
		            public void run() {
		                while (true) {
		                    Date date = new Date();
		                    System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		                    try {
		                        Thread.sleep(1000);
		                    } catch (InterruptedException e) {
		                        e.printStackTrace();
		                    }
		                }
		            }
		        });
		        thread.start();
		    }
		

	}


