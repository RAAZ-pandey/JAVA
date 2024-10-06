package constructor;

public class ques5 
 {
	int x;
	String y;
	void show()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args)
	{
		ques5 a=new ques5();
		a.x=56;
		a.y="waah rajaji";
		ques5 b=new ques5();
		b.y="naughty ho raha hai";
		b.x=69;
		a.show();
		b.show();
	}
}
