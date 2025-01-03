class r1
{
   int l=30,b=50,h=25;
  protected void area()
   {
     System.out.println("Area is   " +(l*b));
     }
  }

class c1 extends r1
{
  public void volume()
   {
     System.out.println("Volume is   " +(l*b*h));
      }
    }

class ques
  {
     public static void main(String arg[])
     {
       c1 x1=new c1();
        x1.area();
        x1.volume();
      }
    }      

     