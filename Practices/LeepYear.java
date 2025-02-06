package Practices;
import java.util.Scanner;
public class LeepYear {
	boolean leepyear=false;
	void leep(int year){
		if(year%4==0){
			leepyear=true;
			if(year%100==0){
				if(year%400==0){
				leepyear=true;
				}else{
					leepyear=false;
				}
			}
		}
		else{
			leepyear=false;
		}
		if(leepyear){
			System.out.println(year+" is a leep year ");
		}else{
			System.out.println(year+" is not leep year ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LeepYear obj=new LeepYear();
		System.out.println("Enter the year ");
		int year=sc.nextInt();
		
		obj.leep(year);
		

	}

}
