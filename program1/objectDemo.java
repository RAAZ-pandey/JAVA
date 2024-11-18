public class objectDemo1
{
  int  a,b;  //instance member
   public void input(int x,int y)

       {
           a=x ;
            b=y ;
         }
       public  void add()
 {
   System.out.println("addition is " +(a+b));
  }

   public int sub()
    
        return(a-b);
}
  
   public static void main(String arg[])

 {
    objectDemo1 x1= new objectDemo1();
    objectDemo2 x2= new objectDemo2();
    
         x1.input(12,11)
         x1.add();
         system.out,println("substraction is " +x1.sub());
            x2.input(22,11);
            x2.add();
         System.out.println("su straction is " +x2.sub());
    }
}