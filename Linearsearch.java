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

