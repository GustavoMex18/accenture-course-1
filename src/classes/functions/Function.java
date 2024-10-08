package classes.functions;

public class Function {

    public int generateRandomNumber() {
        return (int) (Math.random() * 100); // Número aleatorio entre 0 y 99
    }

    public String generateGreeting(String name, int age) {
        return "Hola " + name + ", tienes " + age + " años.";
    }

    // Función con return vacío
    public void printMessageIfPositive(int number) {
        if (number < 0) {
            System.out.println("El número es negativo, terminando la función.");
            return; // Return vacío, finaliza la ejecución de la función
        }
        System.out.println("El número es positivo: " + number);
    }

    // Sobrecarga de funciones (mismo nombre, diferentes tipos de parámetros)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Función recursiva para calcular el factorial
    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        } else {
            return n * calculateFactorial(n - 1); // Llamada recursiva
        }
    }

    // Método que acepta un número variable de enteros usando varargs
    public void printNumbers(int... numbers) {
        System.out.println("Números recibidos:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
