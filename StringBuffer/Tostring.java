package Stringbuffer;

public class Tostring {

	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("ramsetu");
		String s2 = s1.toString();
		String s3 =s2.concat(" is a sign of true love ");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.substring(6));

	}

}
