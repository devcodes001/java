import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Geometry Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Select a shape: ");
            
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            Shape shape = null;

            if (choice == 1) {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                shape = new Circle(r);
            } else if (choice == 2) {
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                shape = new Rectangle(l, w);
            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }
       
    }
}
