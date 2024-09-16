package javademos;
class over1
{
	int a,b;
	public over1()
	{
		a=95;
		b=56;
	}
	
	public over1(int x ,int y)
	{
		a=x;
		b=y;
	}
	public void add()
	{
		System.out.println("addition is  "+(a+b));
	}
	public double add(int p,int q)
	{
		System.out.println("addition is  " +(p+q));
		
		return p ;
	}
	public void add(float e,float f)
	{
		System.out.println("additon is  "+(e+f));
	}
}
public class overloading 
 {
	public static void main(String args[])
	{
		over1 x1=new over1();
		x1.add();
		over1 x2=new over1();
		x2.add();
		x2.add(45,56);
		x2.add(12.58f , 54.23f);
	}

}
