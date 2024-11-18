class boolean1
  {
     public static void main(String arg[])
     
    { 
       int a=29,b=15;
     //  boolean c=a++<--b||++a!=b--;
     // boolean c=a++<--b&&++a!=b--;
     int c=a++<b--?a++*++b/a:--b%a++-++b/b--;
       System.out.println(a);
        System.out.println(b);
          System.out.println(c);
     }
  
   }