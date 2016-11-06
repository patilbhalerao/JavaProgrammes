package JavaP;

public class LoopPrograme {
	
	static void EvenOdd()
	{
		int sum = 0;
		for(int i=1; i<=50; i++)
		{
			
			 sum= sum + i;
			 
			if(i%2 == 0)
			{
				System.out.println("Even No " + i);
				System.out.println(sum);
			}
		    else
			{
		    	System.out.println("Odd NO  " + i);
		    	System.out.println(sum);
			}	
		}	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopPrograme.EvenOdd();

	}
	
	}

