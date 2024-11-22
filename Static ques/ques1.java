package static_ques;

class p2
{
	String x;
	static int y;
	void show()
	{
		System.out.println(x+" " +y);
	}
	p2()
	{
		System.out.println("hello p"+x+y);
		x="RAM";
		y++;
	}
}
public class ques1 
  {
	public static void main(String arg[])
	{
		p2 x1=new p2();
		p2 x2=new p2();
		p2 x3=new p2();
		x1.show();
		x2.show();
		x3.show();
		
	}

}
