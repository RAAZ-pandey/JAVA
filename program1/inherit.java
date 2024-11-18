class c1
{
  int a=89,b=64;
   protected void und()
    {
      System.out.println("Addition is" +(a+b));
      }
   }
    
  class d1 extends c1
  {
     public void rub()
     {
        System.out.println("substraction is" +(a+b));
        }
     }
   
   class inherit
     {
        public static void main(String arg[])
        {
           d1  x1=new d1();
           x1.und();
           x1.rub();
          }
      }