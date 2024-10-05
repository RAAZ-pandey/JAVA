package questions;
 
// shallow copy chnGES  every time when original is changed
// Deep copy never changes its values once something is stored then you can't replace it 
class rect
{
	int length = 9;
	int breadth = 6;
}

public class Shalllow_Copy {

	public static void main(String[] args) 
	{
		rect a1 = new rect();
		//creating shallow copy
		rect  a2 = a1 ;
		
		//creating Deep copy
		rect a3 = new rect();
		a3.length = a1.length;
		a3.breadth = a1.breadth;
		
		System.out.println(" before changing value of a1 : ");
		System.out.println(" length of a2  = " +a2.length);
		System.out.println(" breadth of a2  = " +a2.breadth);
        
		System.out.println(" before changing value of a1 : ");
		System.out.println(" length of a3  = " +a3.length);
		System.out.println(" breadth of a3  = " +a3.breadth);
		
		
		// changing values of a1 to replaced by a2 and a3.
		a1.length = 12;
		a1.breadth = 18;
		
		System.out.println("\n After changing values of a1");
		System.out.println(" length of a2  = " +a2.length);
		System.out.println(" breadth of a2  = " +a2.breadth);
		
		System.out.println("After changing values of a1");
		System.out.println(" length of a3  = " +a3.length);
		System.out.println(" breadth of a3  = " +a3.breadth);
		
		
	}

}
