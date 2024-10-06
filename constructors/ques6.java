package constructor;
class M
{
	int x=89;
	string y="muskan";
	void show()
	{
		x++;
		System.out.println(x+y);
	}
}
public class ques6 
{
	public static void main(String[] args)
	
	{
	   M s1=new M();
	   M s2=new M();
	   s1.show();
	   s1.show();
	   s2.show();
	}

}
