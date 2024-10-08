package tests.testOne;

public class CondicionalesMex {

    // ! ½
    public static void isPositive(float number) {

        // ! Trata de evitar la evaluación de logica en la asignación de una variable
        // (Es una mala practica)
        boolean isPositive = (number > 0);
        System.out.println(isPositive);

    }

    // * ★
    public static void isAdult(int age) {
        if ((age >= 18) && (age < 120)) {
            System.out.println("Usted es adulto");
        } else if ((age > 0) && (age < 18)) {
            System.out.println("Usted no es adulto");
        } else if (age >= 120) {
            System.out.println("Usted es Jesucristo");
        } else {
            System.out.println("Edad no valida");
        }
    }

    // * ★
    public static void sortScores(int grade) {

        switch (grade) {
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A-");
                break;
            case 8:
                System.out.println("B+");
                break;
            case 7:
                System.out.println("B-");
                break;
            case 6:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }

    }

    // ! ½
    public static void isEven(int number) {

        // ! Trata de evitar la evaluación de logica en la asignación de una variable
        // (Es una mala practica)
        boolean isPEven = (number % 2 == 0);

        System.out.println(isPEven);

    }

    // * ★
    public static void validPassword(String password) {

        String key = "BigA**Password";

        boolean isPassword = password.equals(key);
        System.out.println(isPassword);

    }

    // * ★
    public static void isHoliday(String date) {

        switch (date) {
            case "2024-09-16":
                System.out.println("Viva Mexico!!!");
                break;
            case "2024-12-25":
                System.out.println("Es Navidad :D");
                break;
            case "2024-11-01":
                System.out.println("Hanal Pixan");
                break;
            default:
                System.out.println("Dia Normalon");
                break;
        }

    }

}