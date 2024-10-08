package tests.testTwo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * LoopPaulina
 */
public class LoopPaulina {
    // Imprimir los números del 1 al 100
    public void printNumbers() {
        final int CONSTANT_LIMIT = 100;
        for (int index = 0; index <= CONSTANT_LIMIT; index++) {

            System.out.println(index + 1);

        }
    }

    // Sumar los números pares hasta N
    public void addEvenNumbers(int number) {
        int sumatoria = 0;
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                sumatoria += index;
            }
        }
        System.out.println(sumatoria);
    }

    // Encontrar el primer número primo

    /**
     * @param number
     */
    public void getFactorial(int number) {
        int product = number;
        for (int i = 1; i < number; i++) {
            product *= (number - i); //El producto es tal cosa
        }
        System.out.println(product);
    }

    /**
     * Esta funcion hace ...
     * @param number es tal cos
     */
    public void addDigitNumbers(int number) {
        String stringNumber = String.valueOf(number);
        
        List<Integer> result = stringNumber.chars().map(Character::getNumericValue).boxed()
                .collect(Collectors.toList());
        int summation = 0;
        for (int index = 0; index < result.size(); index++) {
            int digit;
            digit = result.get(index);
            summation += digit;
        }
        System.out.println(summation);
    }

    // Adivinar un número secreto

    // Contar cuántos elementos son mayores a X en un arreglo

    // Pedir contraseña (pin de 4 números) hasta que sea correcta

}