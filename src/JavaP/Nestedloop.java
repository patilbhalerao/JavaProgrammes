package JavaP;

public class Nestedloop {
	static int i;
	static int j;
	static void pattern()
	{
		for(i=1;i<=5;i++)
		{
		for(j=i;j<=5;j++)
		{
			System.out.print(i);
		}
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nestedloop.pattern();
	}

}
