import java.util.Scanner;

public class Student {

    long studentId, contact;
    String studentName, className, subject, grade, colName, address,department;
    double subjectMarks, externalMarks, percentage;

    Student() {
        this.colName = "Amrutvahini College of Engineering,Sangamner";
        this.address = "Ghulewadi,Sangamner, Maharashtra";
    }

    void displayDetails(long studentId, String studentName, String className,String department, String subject, double subjectMarks, double externalMarks, long contact) {
        double totalMarks = subjectMarks + externalMarks;
        percentage = (totalMarks / 150) * 100;
       
        if (percentage >= 90) {
            grade = "A+";
        } 
          else if (percentage >= 70) {
            grade = "B+";
        } 
          else if (percentage >= 50) {
            grade = "C+";
        }
          else if (percentage >= 35) {
                grade = "D";
        } 
          else {
            grade = "Fail";
        }
        
        
        System.out.println("--------------------------------------------");
		System.out.println("    "+colName+"        ");
		System.out.println("         "+address+"      ");
		System.out.println("--------------------------------------------");
		System.out.println(studentId+"          "+studentName+"        ");
		System.out.println(contact+"       "+className+" "+department+"        ");
		System.out.println("--------------------------------------------");
        System.out.println("Class           : " + className);
        System.out.println("Department      : " + department);
        System.out.println("Subject         : " + subject);
        System.out.println("Subject Marks   : " + subjectMarks + " / 100");
        System.out.println("External Marks  : " + externalMarks + " / 50");
        System.out.println("Total Marks     : " + totalMarks + " / 150");
        System.out.println("Percentage      : " + percentage + "%");
        System.out.println("Grade           : " + grade);
        System.out.println("Result          : " + (grade.equals("Fail") ? "Fail" : "Pass"));
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        
        System.out.println("Enter the Student ID:");
        long studentId = sc.nextLong();
        sc.nextLine(); 

        System.out.println("Enter the Student Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter the Class:");
        String className = sc.nextLine();
        
        System.out.println("Enter the department:");
        String department = sc.nextLine();

        System.out.println("Enter the Subject:");
        String subject = sc.nextLine();

        System.out.println("Enter the Subject Marks (out of 100):");
        double subjectMarks = sc.nextDouble();

        System.out.println("Enter the External Marks (out of 50):");
        double externalMarks = sc.nextDouble();

        System.out.println("Enter the Contact Number:");
        long contact = sc.nextLong();

       
        obj.displayDetails(studentId, studentName, className,department, subject, subjectMarks, externalMarks, contact);
    }
}