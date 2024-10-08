package tests.testOne;

public class CondicionalesErick {

    // * ★
    public static void isPositive(float number) {
        boolean isPositive = (number >= 0) ? true : false;
        if (isPositive) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }

    // * ★
    public static void isAdult(int age) {

        final int ADULT_AGE_LIMIT = 17;

        boolean isAdult = (age > ADULT_AGE_LIMIT) ? true : false;

        if (isAdult) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es niño");
        }

    }

    // * ★
    public static void sortScores(float score) {
        
        int scoreInt = (int) score;

        final int DATA = 10;

        switch (scoreInt) {
            case DATA:
                System.out.println("A");
                break;
            case 9:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
                break;
            case 7:
                System.out.println("D");
                break;
            case 6:
                System.out.println("E");
                break;
            case 5:
                System.out.println("F");
                break;
            case 4:
                System.out.println("G");
                break;
            case 3:
                System.out.println("H");
                break;
            case 2:
                System.out.println("I");
                break;
            case 1:
                System.out.println("J");
                break;
            default:
                System.out.println("Calif no valida");
        }
    }

    // * ★
    public static void isEven(int number) {
        boolean isEven = (number % 2 == 0) ? true : false;
        if (isEven) {
            System.out.println("Es par");
        } else {
            {
                System.out.println("Es impar");
            }
        }
    }

    // ! ½
    public static void isValidPassword(String password) {

        // ! Recordar convenciones para constantes.
        final String CORRECT_PASSWORD = "Pepete";

        boolean validPassword = (password == CORRECT_PASSWORD) ? true : false;

        if (validPassword) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña erronea");
        }
    }

    // * ★ 1/2
    public static void isHoliday(int day) {
        switch (day) {
            case 10:
            case 20:
            case 30:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Laboral");
        }
    }
}