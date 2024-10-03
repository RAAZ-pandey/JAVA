package inheritance;

class AA
{
	int x=10;
	AA()
	{
		System.out.println("hii brother");
	}
	static 
	{
		System.out.println("okay bro");
	}
}
 class BB extends AA
 {
	 int y=90;
	 {
		 System.out.println("hello big brother");
	 }
	 {
		 System.out.println(" hii big bro"); 
	 }
	 static
	 {
		System.out.println("okay big bro"); 
	 }
 }
public class ques1 
  {
	public static void main(String arg[])
	{
		BB b=new BB();
		System.out.println(b.x+" "+b.y);
	}

}
