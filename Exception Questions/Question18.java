package exception;

public class Question18 
{  
    String str = "a" ;
    
    void A()
    {
    	try
    	{
    		str += "b";
    		B(); 
    	}
    	catch(Exception e)
    	{
    		str += "c";
    	}
    }
     void B() throws Exception
     {
    	 try
    	 {
    		 str += "d" ;
    		 c();
    	 }
    	 catch(Exception e)
    	 {
    		 throw new Exception();
    	 }
    	 finally
    	 {
    		 str += "e" ;
    	 }
    	 str += "f" ;
     }
     
     void c() throws Exception 
     {
    	 throw new Exception();
     }
     
     void display()
     {
    	 System.out.println(str);
     }
	public static void main(String[] args)
	{
		Question18 object = new Question18();
		object.A();
		object.display();

	}

}
