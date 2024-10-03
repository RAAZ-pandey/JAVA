package inheritance;

class A5
{
	void m1()
	{
		System.out.println("in m1 in a");
	}
}

class B5 extends A5
{
	void m1()
	{
		System.out.println("in m1 in b");
	}
}
public class ques4 {

	public static void main(String[] args)
	  {
		B5  b=new B5();
		b.m1();
		A5  a=new A5();
	    a.m1();
	    A5  a2=new A5();
        a2.m1();
	}

}
