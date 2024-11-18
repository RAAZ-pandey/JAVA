import java.util.Scanner;
 class oneton1
{
        static int a=1;
      public oneton1(int n)
 {
    if(a<=n)
    { 
        System.out.println(a++);
          new oneton1(n);
       }
   }
    public static void main(String arg[])
    {
       Scanner t=new Scanner(System.in);
       System.out.println("enter range");
        int n=t.nextInt();
        new oneton1(n);
      }
}
