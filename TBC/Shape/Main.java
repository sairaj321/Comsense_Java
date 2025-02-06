package TBC.Shape;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Select a shape to calculate area:");
    System.out.println("1. Circle");
    System.out.println("2. Rectangle");
    System.out.println("3. Triangle");
    System.out.print("Enter your choice (1-3): ");
    int choice = scanner.nextInt();

    Shape shape;
    switch (choice) {
        case 1:
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            shape = new Circle(radius);
            System.out.println("Circle Area: " + shape.calculateArea());
            break;

        case 2:
            System.out.print("Enter length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width of the rectangle: ");
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);
            System.out.println("Rectangle Area: " + shape.calculateArea());
            break;

        case 3:
            System.out.print("Enter base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter height of the triangle: ");
            double height = scanner.nextDouble();
            shape = new Triangle(base, height);
            System.out.println("Triangle Area: " + shape.calculateArea());
            break;

        default:
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
    }

    scanner.close();
}

}
