package javademos;

class F1
{
	final public void display()
	{
		System.out.println("in ara");
	}
}
class  Z1 extends F1
{
	//public void display()                  final method can not be override
	{
		System.out.println("in my school");
	}
}
public class final_method {

	public static void main(String[] args) {
	//	z1 x1=new z1();
	//	x1.display();

	}

}
