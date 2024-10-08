package tests.testOne;

public class CondicionalesPaulina {

    // * ★
    public void isPositive(double number) {

        if (number > 0) {
            System.out.println("El número es positivo");
        } else if (number == 0) {
            System.out.println("El valor es neutro");
        } else {
            System.out.println("El número es negativo");
        }

    }

    // * ★
    public void isAdult(int age) {
        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    // * ★
    public void sortScores(int score) {
        String grade;
        String message = null;
        switch (score) {
            case 10:
                grade = "A+";
                message = " ¡felicidades! :D";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                grade = "F";
                break;
            default:
                grade = "Inserte una calificación del 0 al 10 para obtener su nota escolar";
                break;
        }

        System.out.println("La nota escolar es: " + grade + message);
    }

    // * ★
    public void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    // * ★
    public void validPassword(String password) {
        String correctPassword = "keok16";
        if (password.equals(correctPassword)) {
            System.out.println("Bienvenido again");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }

    // * ★
    public void isHoliday(String date) {
        System.out.println(
                "Ingrese una fecha en formato dd-mm, por ejemplo: dieciséis de septiembre se traduce como 16-09");
        switch (date) {
            case "16-09":
            case "20-11":
                System.out.println("Tocó descanso mexicano");
                break;
            case "01-11":
                System.out.println("Día de muertos");
                break;
            case "25-12":
                System.out.println("Navidad");
                break;
            case "31-12":
            case "01-01":
                System.out.println("Festividades de fin de año");
                break;

            default:
                System.out.println("Resignación, no hay descanso");
                break;
        }
    }

}