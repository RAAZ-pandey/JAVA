package javademos;

public class classmember 
  {
	static int b; //class member

	public static void main(String[] args)
	{
		int a=89; //local variable
		System.out.println("local variable  " +a);
        System.out.println("class member " +classmember.b);
	}

}
