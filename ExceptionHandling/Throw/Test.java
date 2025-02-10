package ExceptionHandling.Throw;

public class Test {

	public static void main(String[] args) {
		
		Bank obj=new Bank();
		
		try{
		obj.data();
		}
		catch(NumberNotcorrect s){
			System.err.println("Enter the valid input");
		}

	}

}

