import java.util.Scanner;

class Area {
    
    int Area(int length, int width) {
        return length * width;
    }

    int Area(int side) {
        return side * side;
    }

    double Area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Area as = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        System.out.println("Area of Rectangle: " + as.Area(l, w));

        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of Square: " + as.Area(s));

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + as.Area(r));
        
       }
}


