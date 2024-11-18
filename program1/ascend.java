import java.util.Scanner;
class ascend
 {
  public static void main(String arg[])
   {
      int r;
     Scanner t= new Scanner(System.in);
    System.out.println("enter range ");
   
      int n=t.nextInt();
    System.out.println("enter data in array");
      int[] a = new int[n];
         
      
          for(int i=0; i<n; ++i)
         {
         a[i]=t.nextInt();
       }
          for(int i=0; i<n; i++)
       {
      
         for(int j=i+1; j<n; j++)
        {
          
            if(a[j]<a[i])
              {
                r = a[i];
                 a[i]=a[j];
                 a[j]= r;
                 }
             }
           }
            System.out.println("data in ascending order");
           for(int i=0; i<n; i++)
        {
           System.out.println(a[i]);
           }
        
  
   } 
  
}

         
       