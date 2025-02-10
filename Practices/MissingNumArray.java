package Practices;
import java.util.Scanner;
public class MissingNumArray {

	public static int miss(int[] arr,int n){
		
		int total=n*(n+1)/2;
		int arraysum=0;
		
		for(int i=0;i<n-1;i++){
			arraysum+=arr[i];
		}
		int ans=total-arraysum;
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the "+(n-1)+" number in the array");
		int arr[]=new int[n];
		for(int i=0;i<n-1;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(miss(arr,n));
		

	}

}
