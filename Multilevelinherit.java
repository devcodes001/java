import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    String cname;
    int empid;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age, String cname, int empid, String qualification, double salary) {
        super(name, gender, address, age);
        this.cname = cname;
        this.empid = empid;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    int tid;
    String department;

    Teacher(String name, String gender, String address, int age, String cname, int empid, String qualification, double salary, String subject, int tid, String department) {
        super(name, gender, address, age, cname, empid, qualification, salary);
        this.subject = subject;
        this.tid = tid;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Company: " + cname);
        System.out.println("Employee ID: " + empid);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Teacher ID: " + tid);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class Multilevelinherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher "+(i+1)+":");
            
            System.out.print("Name: "); 
            String name = sc.nextLine();
            System.out.print("Gender: "); 
            String gender = sc.nextLine();
            System.out.print("Address: "); 
            String address = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Company Name: "); 
            String cname = sc.nextLine();
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Qualification: "); 
            String qual = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Subject: "); 
            String subject = sc.nextLine();
            System.out.print("Department: "); 
            String dept = sc.nextLine();

            teachers[i] = new Teacher(name, gender, address, age, cname, empid, qual, salary, subject, tid, dept);
        }

        System.out.println("\n All Teacher Details");
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher "+(i+1)+":");
            teachers[i].displayDetails();
        }

    }
}
