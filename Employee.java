import java.util.Scanner;

class Employee1 {
    String name;
    int id;
    double salary;

    Employee1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("id: " + id);     
        System.out.println("name: " + name);
        System.out.println("salary : " + salary);
    }
}

class Teacher extends Employee1 {
    String subject;
    String department;

    Teacher(String name, int id, double salary, String department, String subject) {
        super(name, id, salary);
        this.department = department;
        this.subject = subject;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i+1) + ":");
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            System.out.print("Enter department: ");
            String department = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(name, id, salary, department, subject);
        }

        System.out.println("\nAll Teacher Details");
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1) + ":");
            teachers[i].displayDetails();
        }
    }
}
