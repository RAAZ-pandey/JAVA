package static_ques;
 
class p7
{
	static
	{
		System.out.println("hello program");
	}
	String x;
	
	static
	{
		System.out.println("how you doing");
		//System.out.println(y);           error cz y is not defined yet
	}
	static  int y;
	static
	{
		System.out.println("hii program");
		System.out.println(y);
	}
}
public class ques6 {

	public static void main(String[] args) {
		
		System.out.println("pranam java bhaiya");
		 p7 x1=new p7();
		 p7 x2=new p7();
		 System.out.println("bye program");

	}

}
