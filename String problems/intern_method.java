package String_ques;

public class intern_method {

	public static void main(String[] args)
	{
		String s="india" ;
		String s1=new String("india");
		System.out.println(s==s1);      //comparing reference of string  class
        System.out.println(s==s1.intern());  //intern method  is used to equal refrence of scp & non-scp
	}

}
