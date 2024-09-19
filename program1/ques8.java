package program1;


class ques8

{
	int a, b;
	public ques8()
	{
		a=5;
		b=7;
		System.out.println("default constructor");
	}
	
	public ques8(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("two parametrize");
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{ 
		ques8 A1=new ques8();
		A1.display();
		ques8 x2=new ques8(25,56);
		x2.display();

	}
}



