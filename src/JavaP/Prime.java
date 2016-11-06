package JavaP;

public class Prime {
	
	static int max=100;
	static int count=0;
	static int j=1;
	static int i=1;
	static String primenumber=" ";
	public static void primeno()
	{
		for(int i = 1;i<100;i++)
		{
			for(int j = i;j>=1;j--)
			{
				if(j % 2 == 0)
				{
					 count = count + 1;
									
				}
				if(count == 2)
				{
					primenumber = primenumber + i + " ";
				}
			}
			System.out.print( primenumber);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime.primeno();
	
	}

}
