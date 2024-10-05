package questions;
import java.util.*;
public class Input_untilODD {

	public static void main(String[] args)
	{
		int a;
		Scanner t =new Scanner(System.in);
	
		
		do {
			System.out.println("daal d ago number");
			a=t.nextInt();
		}while(a%2==0);
	}

}
