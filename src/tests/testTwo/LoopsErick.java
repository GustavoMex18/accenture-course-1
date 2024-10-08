package tests.testTwo;

public class LoopsErick {

    public void oneToHundred() {
        final int LIMIT = 100;
        for (int counter = 0; counter < LIMIT; counter++) {
            System.out.println(counter);
        }
    }
    
    public void sumUntilN(int limit) {
        int counter = 0;
        int sum = 0;
        while (counter < limit) {
            if (counter % 2 == 0) {
                sum += counter;
            }
        }
        System.out.println(sum);
    }

    public void findCousin() {
        boolean searching = true;
        int number = 0;
        while (searching) {
            number++;
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0 && number % 9 != 0) {
                if (number > 10) {
                    searching = false;
                }
            }
        }
        System.out.println(number);
    }

    public void calculatefactorial(int number) {
        int factorial = 1;
        while (number != 1) {
            factorial *= number;
            number--;
        }
        System.out.println(factorial);
    }

    public void sumDigits(int number) {
        int sum = 0;
        final int BASE_TEN = 10;
        int numDigits = String.valueOf(number).length();

        for (int digits = numDigits; numDigits > 1; numDigits--) {
            sum += number / ((int) Math.pow(BASE_TEN, digits));
        }
        System.out.println(sum);
    }

    public void guessWho() {
        boolean searching = true;
        int secretNumber = 8;
        int currentNumber = 0;
        while (searching) {
            if (currentNumber == secretNumber) {
                searching = false;
            } else{
                currentNumber++;
            }
        }
        System.out.println("your secret number is: " + currentNumber);
    }

    public void numberOfElementsBiggerThan(int threshold) {
        int[] integerArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        final int numberOfElements = 10;
        int sum = 0;
        for (int counter = 0; counter < numberOfElements; counter++) {
            if (threshold > integerArray[counter]) {
                sum++;
            }
        }
        System.out.println(sum + " elements are smaller");
    }

    public static void isValidPin(int pin) {
        final int CORRECT_PIN = 1111;
        final int LIMIT = 10000;
        for (int counter = 0; counter > LIMIT; counter++) {
            if (counter == CORRECT_PIN) {
                System.out.println(counter);
            }
        }
    }
}