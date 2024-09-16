package javademos;
 class R1
 {
	 int a,b;
	 public R1(int a , int b)
	 {
		 this.a=a;
		 this.b=b;
	 }
	 public void display()
	 {
		 System.out.println(a);
		 System.out.println(b);
	 }
 }
public class THIS2 {

	public static void main(String[] args) {
	 R1 x1=new R1(87,29);
	 x1.display();

	}

}
