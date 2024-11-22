package static_ques;

class p3
{
	static int a=87;
	String b;
	void show()
	{
		a++;
		System.out.println(a+b);
	}
	
	static void display()
	{
		System.out.println("heelo bachwa");
	}
}
public class ques2 {

	public static void main(String[] args) {
		
		System.out.println(p3.a);
		p3 x1=new p3();
		x1.show();
		x1.display();
		System.out.println(p3.a);
		

	}

}
