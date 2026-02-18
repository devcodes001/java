import java.util.Arrays;
import java.util.Scanner;

class Sortchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();
  
        char[] arr = s.toCharArray();
        int n = arr.length;
  
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                  char temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1]= temp;
                
                
                
                }

        }
        }
        System.out.print("sorted string : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
         
        
    }
}








