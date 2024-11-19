package Handling;

import java.io.IOException ;

public class Throws {
	
	 void m () throws IOException 
     {
    	 throw new IOException("device error");
     }
     void n() throws IOException
     {
    	 m();
     }
     
     void p()
     {
    	 try {
    		 n();
    	 }catch(Exception e)
    	 {
    		 System.out.println(" Exception handled ");
    	 }
     }

	public static void main(String[] args) 
	{
        Throws  o1 = new Throws();
        o1.p();
        
        System.out.println(" normal flow ");
	}

}
