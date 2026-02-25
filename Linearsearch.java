import java.util.Scanner;

class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        System.out.println("Enter the element to search:");
        int f = sc.nextInt();
        int a =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == f) {
                flag = 1;
                a = i+1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Element found at "+a);
        } else {
            System.out.println("Element not found!!");
        }

    }
}





Good 👍 Now you are asking theoretical DBMS terms like tuple, attribute, relation etc.

These are VERY COMMON viva questions 🔥

Below is a complete list of basic DBMS terminology questions with short clear answers 👇


---

🔵 Basic Database Terminology Viva Questions


---

1) What is a Relation?

A relation is a table in a database.


---

2) What is a Tuple?

A tuple is a single row in a table.

Example:

Roll_No	Name	Age

1	Arun	20


Here, (1, Arun, 20) is a tuple.


---

3) What is an Attribute?

An attribute is a column in a table.

Example: Roll_No, Name, Age are attributes.


---

4) What is Degree of a Relation?

Degree = Number of attributes (columns).

If table has 5 columns → Degree = 5


---

5) What is Cardinality?

Cardinality = Number of tuples (rows).

If table has 10 rows → Cardinality = 10


---

6) What is Domain?

Domain is the set of valid values for an attribute.

Example: Age → integer values
Gender → {Male, Female}


---

7) What is Entity?

An entity is a real-world object.

Example: Student, Employee, Department.


---

8) What is Entity Set?

Collection of similar entities.

Example: All students in a college.


---

9) What is Weak Entity?

Entity that depends on another entity for identification.


---

10) What is Strong Entity?

Entity that has its own primary key.


---

🔵 Keys Related Viva


---

11) What is Super Key?

Set of attributes that uniquely identifies a tuple.


---

12) What is Candidate Key?

Minimal super key.


---

13) What is Primary Key?

Selected candidate key.


---

14) What is Alternate Key?

Candidate key not chosen as primary key.


---

15) What is Composite Key?

Primary key made of more than one attribute.


---

16) What is Foreign Key?

Attribute that refers to primary key of another table.


---

🔵 Relational Model Concepts


---

17) What is Relational Model?

Database model where data is stored in tables.


---

18) What are properties of a Relation?

1. No duplicate tuples


2. Order of rows doesn’t matter


3. Order of columns doesn’t matter


4. Each cell contains atomic value




---

19) What is Atomicity in relation?

Each field contains only single value.


---

20) What is NULL?

Represents missing or unknown value.


---

🔵 ER Model Viva


---

21) What is ER Diagram?

Graphical representation of entities and relationships.


---

22) What is Relationship?

Association between entities.

Example: Student — enrolls — Course


---

23) Types of Relationships?

One-to-One (1:1)

One-to-Many (1:M)

Many-to-Many (M:N)



---

24) What is Participation?

Indicates whether all entities must participate in relationship.


---

🔵 Normalization Basics


---

25) What is Functional Dependency?

If A determines B → A → B


---

26) What is Partial Dependency?

Depends on part of composite key.


---

27) What is Transitive Dependency?

A → B and B → C then A → C


---

🔥 Very Common Viva Rapid Fire

✔ Difference between Tuple and Attribute
✔ Degree vs Cardinality
✔ Entity vs Entity Set
✔ Super Key vs Candidate Key
✔ Relation vs Table
✔ Domain vs Attribute


---

If you want, I can now give:

🎯 30 rapid-fire viva questions with 1-line answers

🧠 Confusing DBMS terms explained simply

🔥 Only normalization viva questions

📘 ER model diagram-based viva


Tell me which one you want 👌
