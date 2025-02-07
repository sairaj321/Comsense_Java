package TBC.Tasks.OnlineExamSystem;

import java.util.*;

public class Exam {
    private List<Question> selectedQuestions;
    private List<Question> questionBank;
    private int score;

    public Exam() {
        questionBank = new ArrayList<>();
        selectedQuestions = new ArrayList<>();
        score = 0;
        initializeQuestions();
        selectRandomQuestions();
    }

    private void initializeQuestions() {
    	questionBank.add(new Question("Who invented Java?", new String[]{"James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum"}, 0));
        questionBank.add(new Question("What is the default value of an int variable in Java?", new String[]{"0", "null", "undefined", "1"}, 0));
        questionBank.add(new Question("Which of these is not a Java primitive data type?", new String[]{"int", "float", "boolean", "String"}, 3));
        questionBank.add(new Question("Which keyword is used to define a subclass in Java?", new String[]{"extends", "implements", "super", "this"}, 0));
        questionBank.add(new Question("Which of these allows dynamic method dispatch?", new String[]{"Polymorphism", "Abstraction", "Encapsulation", "Inheritance"}, 0));

        questionBank.add(new Question("Which method is called automatically when an object is created?", new String[]{"main()", "finalize()", "constructor", "init()"}, 2));
        questionBank.add(new Question("Which of the following is used to read input in Java?", new String[]{"Scanner", "InputStream", "BufferedReader", "All of the above"}, 3));
        questionBank.add(new Question("Which keyword is used to prevent method overriding?", new String[]{"final", "static", "const", "abstract"}, 0));
        questionBank.add(new Question("Which operator is used to compare values in Java?", new String[]{"=", "==", "!=", "<>"}, 1));
        questionBank.add(new Question("Which package contains the main Java classes?", new String[]{"java.util", "java.lang", "java.io", "java.sql"}, 1));

        questionBank.add(new Question("Which of the following is not a Java loop?", new String[]{"for", "while", "foreach", "repeat"}, 3));
        questionBank.add(new Question("Which keyword is used to handle exceptions in Java?", new String[]{"throw", "throws", "try", "catch"}, 2));
        questionBank.add(new Question("Which of the following is not a valid Java identifier?", new String[]{"_variable", "$number", "9value", "myVar"}, 2));
        questionBank.add(new Question("Which method is used to convert a string into an integer?", new String[]{"Integer.parseInt()", "String.toInt()", "Integer.valueOf()", "toInt()"}, 0));
        questionBank.add(new Question("Which keyword is used to create a constant variable in Java?", new String[]{"final", "const", "static", "constant"}, 0));

        questionBank.add(new Question("Which of the following is a wrapper class in Java?", new String[]{"int", "float", "char", "Integer"}, 3));
        questionBank.add(new Question("What is the size of a Java char?", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, 1));
        questionBank.add(new Question("Which collection class does not allow duplicate elements?", new String[]{"List", "Set", "Map", "ArrayList"}, 1));
        questionBank.add(new Question("Which of these access modifiers allows access within the same package?", new String[]{"private", "protected", "default", "public"}, 2));
        questionBank.add(new Question("Which keyword is used to define an interface in Java?", new String[]{"class", "interface", "implements", "extends"}, 1));

        questionBank.add(new Question("Which of the following is not a valid Java data type?", new String[]{"int", "double", "real", "char"}, 2));
        questionBank.add(new Question("Which of the following allows multiple inheritances in Java?", new String[]{"Interfaces", "Abstract Classes", "Both", "None"}, 0));
        questionBank.add(new Question("Which of the following is true about Java?", new String[]{"Java is platform-independent", "Java supports pointers", "Java does not support garbage collection", "Java does not support multithreading"}, 0));
        questionBank.add(new Question("What is the output of `System.out.println(10 / 3);`?", new String[]{"3.33", "3", "4", "10"}, 1));
        questionBank.add(new Question("Which Java keyword is used to create a thread?", new String[]{"thread", "run", "start", "new"}, 2));

        questionBank.add(new Question("Which of the following is not a valid exception type in Java?", new String[]{"IOException", "SQLException", "ClassNotFoundException", "FileNotFoundError"}, 3));
        questionBank.add(new Question("Which collection allows key-value pair storage in Java?", new String[]{"List", "Set", "Map", "Array"}, 2));
        questionBank.add(new Question("Which method is called before garbage collection?", new String[]{"dispose()", "delete()", "finalize()", "gc()"}, 2));
        questionBank.add(new Question("Which of these statements is true?", new String[]{"Java supports operator overloading", "Java supports method overloading", "Java supports multiple inheritance", "Java supports friend functions"}, 1));

    }

    private void selectRandomQuestions() {
        Collections.shuffle(questionBank);  // Shuffle questions randomly
        selectedQuestions = questionBank.subList(0, 20); // Select first 20 shuffled questions
    }

    public void conductExam() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Online Exam ---");
        for (int i = 0; i < selectedQuestions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            selectedQuestions.get(i).displayQuestion();

            int answer = 0;
            boolean validInput = false;

            
            while (!validInput) {
                System.out.print("Enter your answer (1-4): ");
                if (sc.hasNextInt()) {
                    answer = sc.nextInt();
                    if (answer >= 1 && answer <= 4) {
                        validInput = true; 
                    } else {
                        System.out.println(" Invalid choice! Please enter a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // Consume invalid input
                }
            }

            if (selectedQuestions.get(i).isCorrect(answer)) {
                score++;
            }
        }
        generateResult();
    }

    private void generateResult() {
        System.out.println("\n--- Exam Completed ---");
        System.out.println("Your Score: " + score + " / 20");

        if (score >= 15) {
            System.out.println("Result: Excellent! You Passed.");
        } else if (score >= 10) {
            System.out.println("Result: Good! You Passed.");
        } else {
            System.out.println("Result: Better Luck Next Time. You Failed.");
        }
    }
}
