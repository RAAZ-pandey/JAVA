import java.util.Scanner;
 class oneD
 {
   public static void main(String arg[])
     {
       Scanner s=new Scanner(System.in);
       System.out.println("enter range");

        int n=s.nextInt();
        int[] a1= new int[n];
         
          System.out.println("enter data in array");
          for(int i=0; i<n; ++i)
         a1[i]=s.nextInt();
         System.out.println("my data is in reverse order");
                for(int i=n-1; i>=0; i--)
           System.out.println(a1[i]);
        }
 }