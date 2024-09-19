package program1;
abstract class ab1
{
	int a,b;
	public ab1()
	{
		super();
		System.out.println(" jaa na bhai ");
	}
	public  ab1(int a,int b)
	{
		super();
		this.a=a;
		this.b=b;
		System.out.println("two parametrize contructor of abs");
	}
	public abstract void display();
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
}

class sec2 extends ab1
{
	public sec2()
	{
		System.out.println("ye to gadbad hai re bawa");
	}
	public sec2(int x ,int y) 
	{
		super(x,y);
	}
	public void display()
	{
		System.out.println("ye sab doglapan hai");
	}
}
public class abstract_all {

	public static void main(String[] ram)
	{
	    ab1  x1= new sec2();
	  	sec2  x2 =new sec2(45,12);
        x1.display();
        ab1.add(45, 25);
        x2.sub();
	}

}
