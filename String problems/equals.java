package String_ques;

public class equals {

	public static void main(String[] args)
	 {
		 String s = "india" ;
		  String a= "india" ;
		  String f= " INDIA" ;
		  String v= new  String("india");
		  
		  System.out.println(s.equals(a));
		  System.out.println(a.equals(f));
		  System.out.println(f.equals(v));
		  System.out.println(s.equals(v));

	}

}
