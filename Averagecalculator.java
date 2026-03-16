class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative numbers are not allowed.");
    }
}

public class AverageCalculator {

    public static double calculateAverage(int[] numbers) throws NegativeNumberException {
        if (numbers.length == 0) return 0;

        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                throw new NegativeNumberException();
            }
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, -2, 8};

        try {
            double avg = calculateAverage(data);
            System.out.println("Average: " + avg);
        } catch (NegativeNumberException e) {
            System.err.println(e.getMessage());
        }
    }
}
