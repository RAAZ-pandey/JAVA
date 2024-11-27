package String_ques;

public class equals_ignore {

	public static void main(String[] args)
	{
		 String s = "india" ;
		  String a= "india" ;
		  String f= "INDIA" ;
		  String v= new  String("india");
		  
		  System.out.println(s.equalsIgnoreCase(a));
		  System.out.println(a.equalsIgnoreCase(f));
		  System.out.println(f.equalsIgnoreCase(v));
		  System.out.println(s.equalsIgnoreCase(v));

	}

}
