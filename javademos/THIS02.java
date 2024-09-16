package javademos;
  class R2
  {
	  int a,b;
	  public R2(int x,int y)
	  {
		  a=x;
		  b=y;
		  //return this;
	  }
	  public R2 display()
	  {
		  System.out.println(a);
		  System.out.println(b);
		  return this;
	  }
	  public R2 swap()
	  {
		  a=(a+b)-(b=a);
		  return this;
	  }
  }
public class THIS02 
  {
	public static void main(String arg[])
	{
		new R2(45,89).display().swap().display();
	}

}
