package javademos;


   class computer
{
	public void playmusic()
	{
		System.out.println("music playing......");
	}
	
	public String buy (int cost)
	{
		
		if(cost >= 10)
		return "pen" ;
		
		
		return "nothing";    //we don't have to use else because after pen it will exit from method
	}
}

public class METHODS {

	public static void main(String[] args)
	{
		computer x= new computer();
		x.playmusic();
		String  s = x.buy(2);
		System.out.println(s);

	}

}
