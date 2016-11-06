package JavaP;

public class Maxno {
	
	static int a[]=new int[]{2,1,45,4,100,4,89,76,10};
	
	static int maxno=a[0];
	static int minno=a[0];
	
	public static void max()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j = i;j<a.length;j++)
			{
				if(maxno>a[j])
				{
					maxno=a[j];
				}
			}
			
		}
		System.out.println("Max no :" +  maxno);
		
	}
	
	public static void prime()
	{
		//int max = 100;

	    System.out.println("Generate Prime numbers between 1 and 100. \"1\" is not prime.");

	    // loop through the numbers one by one
	    for (int i = 1; i<100; i++) {
	      boolean prime = true;
	      //analyzes if n is prime      

	      for (int j = 2; j < i; j++) {
	        if (i % j == 0 ) {
	          prime = false;
	          break; // exit the inner for loop
	        }
	      }

	      //outputs primes
	      if (prime && i != 1) {    
	        System.out.print(i + " ");
	      }
	    }
	  
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maxno.max();
		Maxno.prime();
	}

}
