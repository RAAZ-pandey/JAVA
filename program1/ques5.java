package program1;
class Animal
{
	String name;
	private int age;
	String colour;
	void input()
	{
		name="ramcharan";
		age=45;
		colour="gulambi";
	}
	
	void show()
	{
		System.out.println(name+age+colour);
	}
}
public class ques5 
  {
	public static void main(String[] args)
	{
		Animal a= new Animal();
		a.show();
		a.input();
		Animal b=new Animal();
		a.show();
		b.show();
		b.input();
		b.show();
	}

}
