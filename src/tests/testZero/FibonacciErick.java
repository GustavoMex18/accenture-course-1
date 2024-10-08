package tests.testZero;

public class FibonacciErick {

    public static void createSequence(int quantity) {
        int nextNumber = 1;
        int currentNumber = 0;
        int result = 0;
        System.out.println("\nErick:");
        System.out.println("0");
        for (int i = 0; i < quantity - 1; i++) {
            result = nextNumber + currentNumber;
            System.out.println(result);
            currentNumber = nextNumber;
            nextNumber = result;
        }

        System.out.println("fin erick");
    }
}
