import java.util.Scanner;
public class Addition {

	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void sum(){
		System.out.println("---- welcome-----");
		System.out.println("Enter the a value");
		a=sc.nextInt();
		System.out.println("Enter the b value");
		b=sc.nextInt();
		c=a+b;
		System.out.println("sum= "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		obj.sum();
	}

}
