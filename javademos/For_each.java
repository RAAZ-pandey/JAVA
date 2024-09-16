package javademos;

public class For_each {

	public static void main(String[] args)
	{
		int a[]= {55,22,11,33,20};
		System.out.println("\n my array elements \n");
		int s=0;
		for(int i:a)
		{
			System.out.println(i);
			s+=i;
		}
		System.out.println(s);
	}

}
