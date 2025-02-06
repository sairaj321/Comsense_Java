import java.util.Scanner;

public class Swap {
	
		int a,b; 
		Scanner sc= new Scanner(System.in);
		void sum(){
			System.out.println("Enter the a value");
			a=sc.nextInt();
			System.out.println("Enter the b value");
			b=sc.nextInt();
			
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("A= "+a);
			
			System.out.println("B= "+b);
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap obj=new Swap();
		obj.sum();
	}

}
