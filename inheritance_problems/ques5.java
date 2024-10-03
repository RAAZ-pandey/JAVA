package inheritance;

class c1
{
	int x=50;
}
class c2 extends c1
{
	int x=40;
}
public class ques5 {

	public static void main(String[] args)
	 {
		c2   x1=new c2();
		System.out.println("x1.x");
		c1 x2=new c1();
		System.out.println("x2.x");
		c1  x3=new c1();
		System.out.println("x3.x");
	}

}
