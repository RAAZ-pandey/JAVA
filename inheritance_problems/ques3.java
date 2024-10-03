package inheritance;

class A1
{
	public A1()
	{
		System.out.println("in first statement");
	}
}

class A2 extends A1
{
	
}

class A3 extends A2
  {
	public A3()
	{
		System.out.println("third statement");
	}
  }
public class ques3 {

	public static void main(String[] args) 
	 {
		
		new A3();
		new A2();
        new A1();
	}

}
