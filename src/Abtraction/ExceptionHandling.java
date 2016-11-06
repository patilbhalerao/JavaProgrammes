package Abtraction;

public class ExceptionHandling {

	public void doingSomething(){
		try{
			
			String abc="Bhalerao";
			
			System.out.println(" " + abc.length());
			
		}catch(NullPointerException e){
			
			System.out.println(e.getMessage());
			
		}catch(Exception e){
			
			System.out.println(e);
		}
		finally{
			System.out.println("Thanks for using Programe");
		}
		
	}
}
