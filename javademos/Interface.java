package javademos;

interface I1
{
	public void display();
}
class T1 implements I1
{
	public void display()
	{
		System.out.println("for sake of god");
	}
}
public class Interface {

	public static void main(String[] args) 
	{
      I1 x1=new T1();
      x1.display();
	}

}
