package JavaP;

import java.util.Scanner;

public class pattern1 {
	
	static void pattern()
	{
		int i,j;
		int count=5;
		
		for(j=1;j<=4;j++)
		{
						
			for(i=5;i<=20;i=i+5)
			{
				
				System.out.print(count + " ");
				
				count=count+5;
			}
			
			System.out.println("");
		}
	}
	
	static void num()
	{
		int value=1;
		
		for(int i = 5;i<=80;i=i+5)
		{
			if(value<=4)
			{
				System.out.println(i + " ");
				value++;
			}
			else
			{
				System.out.println(i);
				System.out.println();
			}
		}
	}

	static void multi()
	{
		int i,j ;
		int count=2;
		for(j=0;j<=4;j++)
		{		
		
		for(i=2;i<=106;i=i*2)
		{
			count=count+2;
			System.out.print(count + " ");			
		}
		count=count * 2;
		System.out.println();
	}
	}
	static void design()
	{
		int i = 1,j;
		//int count=0;
		for(j=1;j<=i;j++)
		{
			
		for(i=1;i<=5;i++)
		{
			System.out.print(i + " ");
			//count=count + 2;
		}
		System.out.println(" ");
		}
	}
		
		static void pa()
		{
			Scanner n=new Scanner(System.in);
			System.out.print("enrte the no : ");
			int n1 =n.nextInt();
			int i,sum=0,j;
			System.out.print("\n*********************************************\n");
			for(i=1;i<=n1;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(i);		
				}
				System.out.print("\n");
			}
			System.out.print("\n*********************************************\n");
		}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1.pa();
		pattern1.pattern();
		pattern1.num();
		pattern1.multi();
		pattern1.design();
	}

}
