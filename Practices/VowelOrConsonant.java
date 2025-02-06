package Practices;
import java.util.Scanner;
public class VowelOrConsonant {
	
	void letter(char l){
		
		if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'){
			System.out.println(l+" is a vowel");
		}else{
			System.out.println(l+" is a consonant");
		}
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		VowelOrConsonant obj=new VowelOrConsonant();
		System.out.println("Enter the letter to be check: ");
		String word=sc.nextLine();
		
		obj.letter(word.charAt(0));
	}

}
