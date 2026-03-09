class Cpu{
    double price;
    Cpu(double price){
       this.price = price;
    }
    class Processor{
        int cores;
        String manufacturer;
        Processor(int cores,String manufacturer){
           this.cores = cores;
           this.manufacturer = manufacturer;

        }
    }
    void display(){
        System.out.println("Cores :"+ cores);
        System.out.println("Manufacturer:"+manufacturer);
    } 
    }
    static class RAM{
        int memory;
        String manufacturer;
        
        RAM(int memory,String manufacturer){
            this.memory = memory;
            this.manufactuer = manufactuer;
        }
        void display(){
            System.out.println("Memory :"+ memory);
            System.out.println("Manufacturer:"+manufacturer);
        }

    }
}

class test{
    public static void main(String[] args){
        Cpu cpu = new Cpu(3500.0);
        Cpu.Processor proc = cpu.new Processor(12,"Intel");
        Cpu.RAM ram = new Cpu.RAM(32,"Kingston");
        System.out.println("CPU Price: " + cpu.price);
        proc.display();
        ram.display();
        

   
    }





}




Below are simple viva questions and answers for all the programs you mentioned. The answers are short and easy, suitable for lab viva.


---

Java Lab Viva Questions and Answers

1. Program: Display “WELCOME JAVA”

Q1. What is a Java program?
A Java program is a set of instructions written in Java language to perform a task.

Q2. What is the main method?
The main method is the starting point of execution of a Java program.

Q3. Syntax of main method?

public static void main(String[] args)

Q4. What does System.out.println() do?
It prints the output on the screen and moves the cursor to the next line.


---

2. Program: Even or Odd

Q1. How do you check whether a number is even or odd?
Using modulus operator %.

Q2. What is modulus operator?
It returns the remainder after division.

Example:

n % 2 == 0 → Even
n % 2 != 0 → Odd

Q3. What is if-else statement?
It is a decision making statement used to execute code based on condition.


---

3. Program: Leap Year

Q1. What is a leap year?
A year having 366 days is called a leap year.

Q2. Condition for leap year?

Year divisible by 4

Not divisible by 100

Or divisible by 400


Q3. Which loop is used to print leap years in a range?
For loop.


---

4. Program: Product with Lowest Price

Q1. What is a class?
A class is a blueprint for creating objects.

Q2. What is an object?
An object is an instance of a class.

Q3. What are data members?
Variables inside a class are called data members.

Example

int pcode;
String pname;
double price;


---

5. Program: Complex Number Addition

Q1. What is a constructor?
A constructor is a special method used to initialize objects.

Q2. What is a method?
A method is a function defined inside a class.

Q3. Why do we use objects in this program?
To store real and imaginary values of complex numbers.


---

6. Program: CPU with Inner Class

Q1. What is an inner class?
A class defined inside another class is called an inner class.

Q2. What is a static nested class?
A static class inside another class is called a static nested class.

Q3. Example

class CPU
{
   class Processor
   {
   }
}


---

7. Program: Student Marks using Array

Q1. What is an array?
An array is a collection of elements of the same data type.

Q2. How to declare an array?

int a[] = new int[5];

Q3. What is the advantage of arrays?
It stores multiple values using a single variable.


---

8. Program: Matrix Addition

Q1. What is a matrix?
A matrix is a rectangular arrangement of numbers in rows and columns.

Q2. How do you declare a matrix in Java?

int a[][] = new int[3][3];

Q3. Which loops are used for matrix operations?
Nested loops.


---

9. Program: Symmetric Matrix

Q1. What is a symmetric matrix?
A matrix is symmetric if

A[i][j] = A[j][i]

Q2. Example

1 2 3
2 4 5
3 5 6


---

10. Program: Sort Strings

Q1. What is sorting?
Sorting is arranging data in ascending or descending order.

Q2. Which method is used to sort strings?
Arrays.sort()

Q3. Which package contains Arrays class?
java.util


---

11. Program: Sort Characters without sort()

Q1. Which algorithm can be used?

Bubble sort

Selection sort


Q2. What is swapping?
Swapping means exchanging values between two variables.

Example

temp = a;
a = b;
b = temp;


---

12. Program: Search Element in Array

Q1. What is searching?
Finding a specific element in a collection.

Q2. What is linear search?
Checking elements one by one until the element is found.


---

13. Program: Array of Employee Objects

Q1. What is array of objects?
An array that stores objects of a class.

Example

Employee e[] = new Employee[n];

Q2. Why do we use array of objects?
To store multiple object data.


---

14. Program: Method Overloading

Q1. What is method overloading?
Using the same method name with different parameters.

Example

area(int a)
area(int l,int b)
area(double r)

Q2. When does overloading occur?
At compile time.


---

15. Program: Inheritance (Employee – Teacher)

Q1. What is inheritance?
Inheritance allows one class to acquire properties of another class.

Q2. Which keyword is used?

extends

Example

class Teacher extends Employee

Q3. Advantage of inheritance?
Code reusability.


---

16. Program: Multilevel Inheritance

Q1. What is multilevel inheritance?
Inheritance through multiple levels.

Example

Person → Employee → Teacher


---

17. Program: Method Overriding

Q1. What is method overriding?
Redefining a method of parent class in child class.

Q2. When does overriding occur?
At runtime.


---

18. Program: Abstract Class Shape

Q1. What is an abstract class?
A class that cannot be instantiated and may contain abstract methods.

Q2. What is an abstract method?
A method declared without body.

Example

abstract void area();

Q3. Can we create object of abstract class?
No.

Q4. Why use abstract class?
To provide a common structure for subclasses.


---

Very Common Java Syntax Questions

What is the syntax of for loop?

for(int i=0;i<n;i++)

Syntax of while loop

while(condition)
{
}

Syntax of class

class ClassName
{
}

Syntax of object

ClassName obj = new ClassName();


---

✅ Most Frequently Asked Viva Questions

1. What is Java?


2. What is class and object?


3. What is array?


4. What is inheritance?


5. What is method overloading?


6. Difference between overloading and overriding?


7. What is abstract class?


8. What is constructor?




---

If you want, I can also give “30 super important Java viva questions teachers ask 90% of the time” so you can easily pass the viva even if they ask randomly.











