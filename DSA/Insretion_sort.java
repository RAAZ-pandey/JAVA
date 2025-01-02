package SORTING;

public class Insretion_sort {

	public static void main(String[] args)
	{
		int arr[] = {8,5,56,12,36,20};
		
		for(int i=1; i<arr.length;i++)
		{
			int val=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > val)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val ;
		}
		System.out.println(" \n after insertion sorting \n ");
        for(int num :arr)
        {
        	System.out.print(num+ "   ");
        }
	}

}
