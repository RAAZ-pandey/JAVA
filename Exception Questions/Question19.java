package exception;


class AE
{
	public void display() throws ArithmeticException
	{
		System.out.println("RAM RAM BHAI SARYANE");
	}
}
//public class Question19 extends Exception  // u cant extend parent class exception o a child class arithmetic
 //public class Question19 extends ArrayIndexOutOfBoundsException  // it should be either brother class or child class
 public class Question19 extends AE
{
   public void display()
   {
	   System.out.println("RADHE RADHE BHAIYA");
   }
	public static void main(String[] args)
	{
	  	AE  x1 = new Question19();
             x1.display();
             
             try
             {
            	 int a = Integer.parseInt(args[0]);
            	 int b = Integer.parseInt(args[1]);
            	 
            	 System.out.println("result is "+(a/b));
            	 
             }catch(Exception e)
             {
            	 System.out.println(e);
             }
	}

}
