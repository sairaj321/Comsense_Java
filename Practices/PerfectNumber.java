package Practices;
import java.util.Scanner;
public class PerfectNumber {
	
	void Perfect(int n) {
     
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) { 
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n==sum) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 PerfectNumber obj=new PerfectNumber();
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        obj.Perfect(num);
	        
	        

	        
	}

}
