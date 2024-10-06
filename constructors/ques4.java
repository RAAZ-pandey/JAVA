package constructor;
class AAA
{
	int x;
	String y;
	void m()
	{
		x=58;
	}
	
	void show()
	{
		System.out.println(x+y);
	}
}
public class ques4 
{
   public static void main(String []arg)
   {
	   AAA a =new AAA();
	   a.x=48;
	   a.m();
	   AAA b= new AAA();
	   b.y="ribhu";
	   b.m();
	   b.x=89;
	   a.show();
        b.show();
        }

}
