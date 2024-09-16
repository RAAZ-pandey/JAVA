package javademos;
class IM
{
	static int b;  //class memeber
	int c;         //instance member
	public void display()
	{
		System.out.println("hello india");
	}
}
public class instancemember {

	public static void main(String[] args)
	 {
		int a=69;     //local variable
		System.out.println("local variable value  " +a);
		System.out.println("class member value    " +IM.b);
        IM x=new IM();
        System.out.println("instance member name  " +x.c);
        x.display();
        
	}

}
