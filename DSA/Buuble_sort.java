package SORTING;

public class Buuble_sort {

	public static void main(String[] args)
	{
		 int val[]= {12, 43, 8, 9, 7};
		int temp ;
		
		int max = val.length;
		
        System.out.println("before sorting \n");
		
		for(int i=0;i<max;i++)
        //.for(int  i : val)
		{
			System.out.print(val[i] + "   ");
		}

		for(int i=0;i<max;i++)
		{
			for(int j=0;j<max-i-1;j++)
			{
				if(val[j] > val[j+1])
				{
					temp = val[j];
					val[j] = val[j+1];
					val[j+1] =temp ;
				}
			}
		}
		
		
		
		
		
       System.out.println("\n after sorting");
		
		for(int i=0;i<max;i++)
		{
			System.out.print(val[i] + "   ");
		}

	}

}
