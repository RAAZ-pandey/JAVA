package javademos;


class const1
{
	int a,b;
	public const1()
	{
		a=3;
		b=2;
		System.out.println("default constructor");
	}
	public const1(int x ,int y)
	{
		a=x;
		b=y;
		System.out.println("two parameterize constructor");
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class constructor
  {
	public static void main(String[] args)
	{
		const1 x=new const1();
		x.display();
		const1 y=new const1(25,56);
		y.display();

	}
	
  }	
