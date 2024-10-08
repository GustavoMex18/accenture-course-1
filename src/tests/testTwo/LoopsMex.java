package tests.testTwo;

import java.util.Scanner;

public class LoopsMex {

    public void countToOneHundred() {
        for (int iterator = 0; iterator <= 99; iterator++) {
            System.out.println(iterator + 1);
        }
    }

    public void sumEvens(int number) {
        int summation = 0;
        for (int iterator = 0; iterator <= number; iterator += 2) {
            summation += iterator;
        }
        System.out.println(summation);
    }

    public void findFirstPrime() {

        int iterator = 10;

        while (!isPrime(iterator)) {

            iterator++;

        }

        System.out.println("El primer número primo es:");
        System.out.println("**************************");
        System.out.println("\t \t " + iterator);
        System.out.println("**************************");
        System.out.println(":D");
    }

    public void getFactorial(int number) {
        int result = 1;
        for (int iterator = 1; iterator <= number; iterator++) {
            result *= iterator;
        }
        System.out.println(result);
    }

    public void getDigitsSum(int number) {

        String stringNumber = String.valueOf(number);

        int sum = 0;
        char characterSummand;
        int integerSummand;

        for (int iterator = 0; iterator < stringNumber.length(); iterator++) {
            characterSummand = stringNumber.charAt(iterator);
            integerSummand = Character.getNumericValue(characterSummand);

            sum += integerSummand;
        }

        System.out.println(sum);

    }

    public void guessSecretNumber() {
        int secretNumber = 117;
        int myNumber = 1;

        while (myNumber != secretNumber) {
            myNumber++;
        }

        System.err.println("Congratulations!!! You found the secret number" + myNumber);

    }

    public void countElementsGreaterThan(int number) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int count = 0;

        for (int iterator = 0; iterator < array.length; iterator++) {
            if (array[iterator] > number) {
                count++;
            }
        }

        System.out.println("Hay " + count + "elementos mayores a " + number + "en el arreglo");

    }

    public void getPassword() {

        String password = "AwesomePassword";

        Scanner scanner = new Scanner(System.in);
        String inputPassword;

        do {

            System.out.println("Introduce la contraseña:");
            inputPassword = scanner.nextLine();

        } while (!inputPassword.equals(password));

        System.out.println("#############  Welcome to BBVA  ############");
        scanner.close();

    }

    private boolean isPrime(int number) {
        boolean result = true;
        for (int iterator = 2; iterator <= number - 1; iterator++) {
            if (number % iterator == 0) {
                result = false;
            }
        }

        return result;
    }

}