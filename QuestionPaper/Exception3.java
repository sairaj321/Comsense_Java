package QuestionPaper;

import java.util.Scanner;

public class Exception3 {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Age is valid. You can register to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age for Voting: " + e.getMessage());
        } finally {
            sc.close(); // Close scanner to prevent memory leaks
        }
    }
}




