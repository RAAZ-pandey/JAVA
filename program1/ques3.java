package program1;
class Q
{
	int x=85;
	String y=x+"bharat";
	int m(String a)
	{
		x++;
		y+=a;
		return x;
	}
	void show()
	{
		System.out.println(x+y);
	}
}

public class ques3 
 {
	public static void main(String []args)
	{
		Q q1=new Q();
		Q q2=new Q();
		int a=q1.m("desh");
		q2.m("mahaan");
	     q1.show();
	     q2.show();
	     q2.x=a;
	     System.out.println(q2.x);
	}

}
