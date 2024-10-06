package constructor;
class A
{
	int x;
	void m()
	{
	  System.out.println("hii rajvardhan");
	}
}
public class ques2 
{
	public static void main(String[] args)
	{
		A a=new A();
		a.x=11;
		a.m();
		A b=new A();
		b.x=69;
		System.out.println(a.x);
		System.out.println(b.x);
		
	}

}
