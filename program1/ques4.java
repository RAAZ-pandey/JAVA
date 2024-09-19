package program1;
class F
{
	int x=46;
	String y="lmao";
	void show()
	{
		System.out.println(x+y);
	}
}
public class ques4 
  {
	public static void main(String[] args)
	{
		F a=new F();
		F b= new F();
		a.x=87;
		a.y="kid";
		a.show();
		b.show();
		b.y="bhidu";
		a.show();
		b.show();
	}

}
