package tests.testZero;

public class FibonacciMex {

    public static void createSequence(int quantity) {

        int x = 0, y = 1;

        int sum;

        if (quantity <= 0) {
            System.out.println("La cantidad debe ser mayor que 0");
            return;
        }

        if (quantity == 1) {
            System.out.println(x);
            return;
        }
        if (quantity == 2) {
            System.out.println(x);
            System.out.println(y);
            return;
        }
        if (quantity >= 3) {

            System.err.println("\u001B[34m" + x);
            System.err.println("\u001B[34m" + y);

            for (int i = 0; i < quantity; i++) {

                sum = x + y;
                System.err.println("\u001B[34m" + sum);

                x = y;
                y = sum;

            }
        }

    }
}
