package javademos;

class T
{
	public static void display(String a)
	{
		System.out.println(a);
	}
}
public class Tostring_method {

	public static void main(String[] args)
	{
		int x=87;
		char c='v' ;
		boolean f =true ;
		
		T.display(Integer.toString(x));
		T.display(Character.toString(c));
		T.display(Boolean.toString(f));

	}

}
