package program1;
class P
{
	int x=89;
	String y="ribhu";
	void m(int a)
	{
		show();
		x=a;
		y=x+"bhand"+y;
	}
	void show()
	{
		System.out.println(x+y);
	}
}
public class ques2 
  {
	public static void main(String[] args)
	{
		P d1=new P();
		P d2=new P();
		d1.m(69);
		d2.m(58);
		d1.show();
		d2.show();
	}

}
