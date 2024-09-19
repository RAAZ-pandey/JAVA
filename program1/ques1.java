package program1;
class M
{
	int x=0;
	String y="radheshyam";
	void show()
	{
		x++;
		System.out.println(x+y);
	}
}

public class ques1 
 {
	public static void main(String[] args)
	{
		M m1= new M();
		M m2= new M();
		m1.show();
		m1.show();
		m2.show();
    }

}
