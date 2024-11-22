package static_ques;

class p6
{
	static int x;
	String y="jane de";
	
	void show()
	{
		System.out.println(x+y);
		x++;
	}
}
public class ques5 {

	public static void main(String[] args) {
	
         p6 x1=new p6();
         p6 x2=new p6();
         
         x1.show();++p6.x;
         x2.show();
         x1.show();
	}

}
