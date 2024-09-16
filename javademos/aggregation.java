package javademos;

class AG
{
	int a;
	
	public AG(int x )
	{
		a=x;
	}
	public void display()
	{
		System.out.println("a="  +a);
	}
}
class AB
{
	AG a;
	int b;
	public AB(int x ,int y)
	{
		a=new AG(x);
		b=y;
	}
	public void display()
	{
		a.display();   
		System.out.println("b= " +b);
	}
}
public class aggregation {

	public static void main(String[] args) 
	 {
		 AB x=new AB(14,56);
		 x.display();

	}

}
