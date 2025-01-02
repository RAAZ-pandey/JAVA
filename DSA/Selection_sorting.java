package SORTING;

public class Selection_sorting {

	public static void main(String[] args)
	
			{
		
				 int val[]= {25,56,58,41,26,30};
				int temp , min ;
				
				int max = val.length;
				
		        System.out.println("before sorting \n");
				
				for(int i=0;i<max;i++)
				{
					System.out.print(val[i] + "   ");
				}
				
				for(int i=0;i<max;i++)
				{
					min =i;
					for(int j=i+1;j<max;j++)
					{
						if(val[min]>val[j])
							min = j;
						
					}
					
					temp = val[min] ;
					val [min] = val[i] ;
					val[i] = temp ;
					
				}
				
							
				
                 System.out.println("\n after sorting \n");
 				
 				for(int i=0;i<max;i++)
 				{
 					System.out.print(val[i] + "   ");
 				}
	    }

	}

