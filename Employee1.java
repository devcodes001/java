import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double salary;

    void getData(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Salary: " + salary);
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            emp[i] = new Employee();
            emp[i].getData(sc);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchemp = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].eno == searchemp) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        
    }
}

