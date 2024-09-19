package program1;
class G
{
	private int x;
	public void show()
	{
		x++;
		System.out.println(x);
	}
}
public class ques6 
  {
	public static void main(String args[])
	{
	  G a=new G();
	   a.show();
	   G b=new G();
	   a.show();
	   b.show();
	   
	}

}
