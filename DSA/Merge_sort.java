package SORTING;

public class Merge_sort
{

	private static void mergesort(int[] val, int l, int r)
	{
		if(l<r)
		{
			int mid =(l+r)/2 ;
			mergesort(val , l, mid);
			mergesort(val ,mid+1, r);
			
			merge(val ,l, mid,r);
		}
		
	}
	private static void merge(int[] val, int l, int mid, int r)
	{
		
		int n1 =mid - l + 1   ;
		int n2 = r- mid ;
		
		int larr[] =new int[n1];
		int rarr[] =new int[n2];
		
		
		for(int x=0;x<n1;x++)
		{
			larr[x]=val[l+x];
		}
		
		for(int x=0;x<n2;x++) 
		{
			rarr[x]=val[mid+1+x];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1  && j<n2)
		{
			if(larr[i] <= rarr[j])
			{
				val[k] =larr[i];
				i++;
			}
			
			else
			{
				val[k] = rarr[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			val[k] =larr[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			val[k] = rarr[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args)
	{
		int val[]= {56,62,23,35,18,78,49,91,154};
		
		for(int n: val)
		{
			System.out.println(n + "  ");
		}
		System.out.println();
		
		mergesort(val ,0,val.length-1);
		
		
		
		
		
		System.out.println(" After sorting");
		for(int n: val)
		{
			System.out.println(n +"  ");
		}
		
	}


}
