package Practices;
import java.util.Scanner;
public class DiamondPattern {
			
	void pattern(){
		int j,i;
		int n=10;
		
		for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(j=i;j>=1;j--){
                 System.out.print("*");
             }
             for(j=2;j<=i;j++){
                 System.out.print("*");
             }
           System.out.println();
         }
		for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(j=i;j>=1;j--){
                 System.out.print("*");
             }
             for(j=2;j<=i;j++){
                 System.out.print("*");
             }
           System.out.println();
         }


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DiamondPattern obj = new DiamondPattern();
//		System.out.println("Enter the Number to be Print diamond");
//		int n=sc.nextInt();
		obj.pattern();
	}

}
