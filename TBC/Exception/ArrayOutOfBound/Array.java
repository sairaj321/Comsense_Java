package TBC.Exception.ArrayOutOfBound;
import java.util.Scanner;
public class Array {
	public void arr(int n){
		int arr[] = new int[100];

       
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1; 
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of N: ");
            int n = sc.nextInt();
            
            if (n <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }
            
            Array obj = new Array();
            obj.arr(n);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number is less than 100");
        }
	}

}
