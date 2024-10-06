package constructor;
class AA
{
	int x;
	String y;
	void show()
	{
		System.out.println(x+y);
	}
}

public class ques3 
{
	public static void main(String[] args)
  {
	AA a = new AA();
	a.x=1690;
	AA b = new AA();
	b.y ="ragjuvanshi";
	a.show();
	b.show();
  }

}
