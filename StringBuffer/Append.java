package Stringbuffer;

public class Append {

	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer(" india");
		StringBuffer s2 = new StringBuffer(" USSR");
		StringBuffer s3 = s1.append(" is a great country");
		StringBuffer s4 = s2.append(" is a old country");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
