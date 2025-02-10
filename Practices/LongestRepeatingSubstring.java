package Practices;
import java.util.*;
public class LongestRepeatingSubstring {

	
	public static String find(String str){
		int n=str.length();
		String longs="";
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				String sub=str.substring(i,j);
				
				if(str.indexOf(sub,j)!=-1 && sub.length()>longs.length()){
					longs=sub;
				}
			}
		}
		return longs;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String");
		String input=sc.next();
		
		String res=find(input);
		
		if(res.isEmpty()){
			System.out.println("No repeating substring found.");
		}else{
			System.out.println("Longest Repeating Substring: " + res);
		}
	}

}
