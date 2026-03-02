
import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter no of subjects:");
        int n = sc.nextInt();
        System.out.print("enter marks out of :");
        int t = sc.nextInt();
        int marks[] = new int[n];
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("enter marks for subject out of  : " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        
        double percentage = ((double) total / (t*n))*100;
        
        System.out.println("total marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        
    }
}
