package TBC.Exception.MultipleCatch;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try{
		System.out.println("Enter the number :");
		String str=sc.next();
		int num=Integer.parseInt(str);
		
		System.out.print("Enter an index: ");
        int index = sc.nextInt();

        int arr[] = {10, 20, 30};
		}catch(NumberFormatException e){
			System.out.println("error : Enter valid number...");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error : ");
		}
	}

}
