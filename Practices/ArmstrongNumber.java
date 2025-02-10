package Practices;

import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
        int temp = num, count = 0, sum = 0;

        
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;

        
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        return sum == num;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit (n): ");
        int n = sc.nextInt();
       

        System.out.println("Armstrong numbers from 0 to " + n + " are:");
        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
	}

}
