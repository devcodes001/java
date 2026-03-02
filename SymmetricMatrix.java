import java.util.Scanner;

class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        
        int a[][] = new int[n][n];
        boolean res = true; 
        
        System.out.println("Enter first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    res = false;
                    break;
                }
            }
            if (!res) {
               break;
            }
        }

        if (res) {
            System.out.println("Symmetric");
        } else {
            System.out.println("not symmetric");
       }
        
        
    }
}
   
        
