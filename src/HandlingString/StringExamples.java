package HandlingString;

public class StringExamples {
	
	
	String a[]={"Bhalerao","Ravindra","Patil"};
	int index;
	
	static{
		System.out.println("I am Static");
	}
	
	public StringExamples()
	{
		System.out.println("I am Constructor");
	}
	
	public void display()
	{
		System.out.println(a[2].charAt(0) + " " + a[0]);
	}
	
	static String name="Bhalerao Ravindra Patil";
	
	public void printString() {
		// TODO Auto-generated method stub
		System.out.println(name);
		
		
	}
	 public void displaystring()
	 {
		 int len=name.length();
		 System.out.println(len);
		 
		 String[] afterSplit=name.split(" ");
		// System.out.println(name);
		 
		 for(int j = 0; j<afterSplit.length; j++)
		 {
		 for(int i = afterSplit[j].length()-1;  i>=0; i--)
		 {
			/* if(name.charAt(i)==' ')   //Remove the space between character//
			 {
				 continue;
				// break;
			 }
			 else{  */ 
			 
			 System.out.print(afterSplit[j].charAt(i));
			 
			 }
		 System.out.print(" "); 
		 }
		
	 }		 
}


	
	

