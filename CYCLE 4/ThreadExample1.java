class MultiplicationTable implements Runnable {
    @Override
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}

class PrimeNumbers implements Runnable {
    @Override
    public void run() {
        System.out.println("First 10 Prime Numbers:");
        int count = 0;
        int num = 2;
        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        PrimeNumbers primeNumbers = new PrimeNumbers();

        Thread thread1 = new Thread(multiplicationTable);
        Thread thread2 = new Thread(primeNumbers);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}

