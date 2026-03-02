import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Square extends Shape {
    double side;

    Square(double s) {
        this.side = s;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class shape1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = input.nextDouble();
        System.out.print("Enter width: ");
        double w = input.nextDouble();
        Shape r = new Rectangle(l, w);

        System.out.print("Enter radius: ");
        double rad = input.nextDouble();
        Shape c = new Circle(rad);

        System.out.print("Enter side: ");
        double s = input.nextDouble();
        Shape sq = new Square(s);

        System.out.println();
        r.calculateArea();
        c.calculateArea();
        sq.calculateArea();

        input.close();
    }
}
