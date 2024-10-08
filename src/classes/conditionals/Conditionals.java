package classes.conditionals;

public class Conditionals {

    public void isDivisibleBy(int number, int divisor) {

        boolean isDivisible = (number % divisor == 0) ? true : false;

        System.out.println(isDivisible);

    }

    public void determinePositive(int number) {

        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        }

    }

    public void determineTheDay(int dayNumber) {
        int data = 0;
        switch (dayNumber) {
            case 0:
                System.out.println("Lunes");
                break;
            case 1:
                System.out.println("Martes");
                break;
            case 2:
                System.out.println("Miércoles");
                break;
            case 3:
                System.out.println("Jueves");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        System.out.println(data);
    }

}
