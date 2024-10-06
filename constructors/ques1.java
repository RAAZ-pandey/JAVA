package constructor;

class N
{
	int x=90;
	String y="ram";
	void m(int a)
	{
		
		x=a;
		y=y+x;
	}
	
	void show()
	{
		System.out.println(x+y);
	}
}

public class ques1 
 {
	public static void main(String[] args)
	{
		N m1=new N();
		N m2=new N();
		m1.m(15);
		m2.m(45);
		m1.show();
		m2.show();
	}

}
