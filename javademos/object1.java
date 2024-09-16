
package javademos;
 class OD
 {
	 int a,b;                         //instance member
	 public void input(int x,int y)
	 {
		 a=x;
		 b=y;
	 }
	 public void add()
	 {
		 System.out.println("addition is  "+(a+b));
	 }
	 public int sub()
	 {
		 return  a-b;
	 }
 }
public class object1
 {
	public static void main(String arg[])
	{
		 OD x1 = new OD();
		 OD x2 = new OD();
		 
		 x1.input(92, 56);
		 x1.add();
		 
		 System.out.println("substraction is  " +x1.sub());
		 
		 x2.input(89, 57);
		 x2.add();
		 
		 System.out.println("substraction is  " +x2.sub());
	}

}
