package static_ques;
 class p5
 {
    static int x;
    String y="kya be";
    static float z=9;
    
    void show()
    {
    	x++;
    	System.out.println(x+y+z);
    }
    void r(String a)
    {
    	z=x++-z++;
    	y=a+z;
    }
 }  
public class ques4 {

	public static void main(String[] args) {
		
         p5 x1=new p5();
         p5 x2=new p5();
          x1.show();
          x1.r("pandey jee");
          x2.show();
          x2.show();
          x1.show();
	}

}
