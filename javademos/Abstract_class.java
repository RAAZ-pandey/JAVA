package javademos;

abstract class as1
{
	public abstract void display();
	public void print()
	{
		System.out.println( "in patna" );
	  }
}


  class sa1 extends as1
{
	public void display()
	{
		System.out.println(" in bihar");
	}
}
public class Abstract_class {

	public static void main(String[] args) {
		
		as1 x1=new sa1();
		x1.display();
		x1.print();

	}

}
