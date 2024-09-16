package javademos;
import java.util.Scanner;

public class twoD
 {
	public static void main(String[] args)
	 {
		Scanner t=new Scanner(System.in);
		System.out.println("enter row and columns");
	   
		int r=t.nextInt();
		int c=t.nextInt();
		int [][] a1=new int[r][c];
		System.out.println("enter data in array");
		
		 for (int i=0;i<c;i++)
		 {
			 for(int j=0; j<c; j++)
			 {
				 a1[i][j] =t.nextInt();
			 }
		 }
		 System.out.println("my data matrix ");
		 
		 for (int i=0; i<r; i++)
		 {
			 for(int j=0; j<c; j++)
			 {
				 System.out.println("\t" +a1[i][j]);
			 }
			 System.out.println(     );
		 }
	 }
	

}
