public class exception {
    public static void main(String[] args) {
        
        try {
            int dividend = 10;
            int divisor = 0;
            System.out.println(dividend / divisor);
        } catch (ArithmeticException e) {
            System.out.println("can't divide a number by zero");
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bound");
        } finally {
            System.out.println("Execution finished");
        }
    }
}
