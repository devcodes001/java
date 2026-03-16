import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative numbers are not allowed.");
    }
}

public class Averagecalculator {

    public static double calculateAverage(int[] numbers) throws NegativeNumberException {
        if (numbers.length == 0) return 0;
        int sum = 0;
        for (int num : numbers) {
            if (num < 0) throw new NegativeNumberException();
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();
        int[] data = new int[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            data[i] = scanner.nextInt();
        }

        try {
            double avg = calculateAverage(data);
            System.out.println("Average: " + avg);
        } catch (NegativeNumberException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
