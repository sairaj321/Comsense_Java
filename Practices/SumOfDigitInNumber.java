package Practices;
import java.util.*;
import java.util.Scanner;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
			int num=n%10;
			sum+=num;
			
			n/=10;
		}
		System.out.println(sum);
	}

}
