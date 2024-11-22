package static_ques;

class p4                                // smajh mhi aaya
{
	static int x=76;
	String y;
	void show()
	{
		x++;
		System.out.println(x+y);
	}
}
public class ques3 {

	public static void main(String[] args) {
		
		p4 x1=new p4();
		p4 x2=new p4();
		x1.x=80; x2.y="parmeshwar";
	    x2.x=45; x1.y="ishwar";
	    x1.show();
	    x2.show();

	}

}
