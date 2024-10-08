package tests.testZero;

public class FibonacciPaulina {

    public static void createSequence(int quantity) {
        int previousNumber = 0;
        int secondPreviousNumber = 1;
        int nextNumber;
        int index;
        for (index = 0; index <= quantity - 1; index++) {
            // if(){

            // } else if{
            nextNumber = previousNumber + secondPreviousNumber;
            previousNumber = secondPreviousNumber;
            secondPreviousNumber = nextNumber;
            System.out.println("\u001B[35m" + nextNumber);
        }
        // }

    }

}