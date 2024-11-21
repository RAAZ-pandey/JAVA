package problems;

public class pyramid {

	public static void main(String[] args)
	{
		int i , j ;
		int rows = 19 ;
		for(i=1 ;i<=rows;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i ;k<=rows*2-i;k++) {
				if(k==i ||k== rows*2-i||i==rows) 
				{
					System.out.print("a");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

}
