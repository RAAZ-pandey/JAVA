package javademos;
class SI
{
	int a=67 , b=43;
	protected void add()
	{
	   System.out.println("addition is   "+(a+b));
	}
}
 class c1 extends SI
 {
	 public void sub()
	 {
		 System.out.println("subtraction is  " +(a-b));
	 }
 }

public class simple_inheritance 
  {
	public static void main(String arg[])
	{
		c1  x1=new  c1();
		x1.add();
		x1.sub();
	}

}
