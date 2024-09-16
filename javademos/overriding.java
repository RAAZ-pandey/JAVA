package javademos;

class animal2
{
	public void whoiam()
	{
		System.out.println("I am animal");
	}
}
class rat extends animal2
{
	public void whoiam()
	{
		System.out.println(" I am dog");
	}
}
class cat extends animal2
{
	public void whoiam()
	{
		System.out.println(" I am cat");
	}
	
}
class snake extends animal2
{
	public void whoiam()
	{
		System.out.println(" I am snake");
	}
}
public class overriding 
 {
	public static void main(String args[])
	 {
		animal2 x1=new animal2();  //compile time binding
		animal2 x2=new rat();
		animal2 x3=new cat();
		animal2 x4=new snake();
		
		 x1.whoiam();
		 x2.whoiam();
		 x3.whoiam();
		 x4.whoiam();
		 
	 }
		
	}


