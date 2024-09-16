package javademos;

class animal
{
	public void eat()
	{
		System.out.println("going to eat");
	}
}
class dog extends animal
 {
	public void bark()
	{
		System.out.println("going to bark");
	}
  }
 class kukur extends dog
 {
	 public void kata()
	 {
		 System.out.println("kaat lega bc");
	 }
 }
public class multilevel_inheritance 
  {
	public static void main(String arg[])
	{
		kukur x1=new kukur();
		x1.eat();
		x1.bark();
		x1.kata();
	}

}
