import java.util.Scanner;
public class AreaCircle {
	
	
	Scanner c=new Scanner(System.in);
	void circle(){
		int a;
		double pi=3.14;
		System.out.println("enter the Radius value");
		a=c.nextInt();
		double ans=pi*a*a;
		System.out.println("Area circle= "+ans);
	}
	void rectangle(){
		int l,b;
		System.out.println("Enter the length");
		l=c.nextInt();
		System.out.println("Enter the bredth");
		b=c.nextInt();
		int ans=l*b;
		System.out.println("Area of rectangle= "+ans);
		
	}
	void square(){
		int a;
		System.out.println("enter the square");
		a=c.nextInt();
		int ans=a*a;
		System.out.println("Area of square= "+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircle obj=new AreaCircle();
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("*******************************");
		System.out.println("1 Area Circle");
		System.out.println("2 Area Rectangle");
		System.out.println("3 Area Square");
		System.out.println("4 Exit");
		System.out.println("*******************************");
		int q=sc.nextInt();
		
		switch(q){
		case 1:obj.circle();
			break;
		case 2:obj.rectangle();
			break;
		case 3:obj.square();
			break;
		case 4:System.exit(0);
		break;
		default: System.out.println("Enter the write choise");
		}
		}
	}

}
