class Tables extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}

class Prime extends Thread {
    private int n;

    public Prime(int n) {
        this.n = n;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                System.out.println("Prime: " + number);
                count++;
            }
            number++;
        }
    }
}

public class exp22 {
    public static void main(String[] args) {
        Tables t1 = new Tables();
        Prime t2 = new Prime(10);

        t1.start();
        t2.start();
    }
}
