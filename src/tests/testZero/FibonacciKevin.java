package tests.testZero;

public class FibonacciKevin {

    public static void createSequence(int quantity) {
        System.out.println("Kevin:");
        
        int[] init = { 0, 1 };

        if (quantity <= 0) {
            System.out.println("La cantidad debe ser mayor que 0");
            return;
        }


        if (quantity == 1) {
            System.out.println(init[0]);
            return;
        }

        if (quantity == 2) {
            System.out.println(init[0]);
            System.out.println(init[1]);
            return;
        }

        if (quantity >= 3) {

            int firstPrevious = init[0];
            int secondPrevious = init[1];

            System.out.println(firstPrevious);
            System.out.println(secondPrevious);

            for (int i = 3; i <= quantity; i++) {

                int fibonacciNumber = firstPrevious + secondPrevious;

                System.out.println(fibonacciNumber);

                firstPrevious = secondPrevious;
                secondPrevious = fibonacciNumber;
            }

        }

    }

}
