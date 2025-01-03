package Stringbuffer;

public class Reverse {

	

	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer(" Reviver");
		StringBuffer s2 = new StringBuffer("backward ");
		StringBuffer s3 = s1.reverse();
		StringBuffer s4= s2.reverse();
		StringBuffer s5 = s1.replace(2 ,6 ,"ram");	
		StringBuffer s6= s2.replace(2, 4, "re");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

	}

}
