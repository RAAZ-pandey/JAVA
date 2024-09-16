package javademos;
class R
 {
	int a,b;               //instance memeber
	public R(int x,int y)
	{
		a=x;
		b=y;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
 }
public class THIS1 
   {
	public static void main(String arg[])
	{
		R x1=new R(45,86);
		x1.display();
	}

}
