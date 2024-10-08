package main;

import tests.testZero.*;
import classes.types.Type;
import classes.conditionals.*;
import classes.functions.Function;
import classes.loops.Loop;

//* ★
//? ½
//! ✕

public class Main {
    public static void main(String[] args) throws Exception {

    }

    // Clases

    @SuppressWarnings("unused")
    private static void typeClass() {

        Type type = new Type();

        boolean comparisonResult = type.showComparison("==");

        System.out.println(comparisonResult);
    }

    @SuppressWarnings("unused")
    private static void conditionalsClass() {
        Conditionals conditionals = new Conditionals();

        conditionals.isDivisibleBy(6, 8);

        conditionals.determinePositive(0);

        conditionals.determineTheDay(5);

    }

    @SuppressWarnings("unused")
    private static void loopClass() {

        Loop loop = new Loop();

        loop.doWhileLoop(false);

        loop.whileLoop(false);

    }

    @SuppressWarnings("unused")
    private static void functionsClass() {

        Function function = new Function();

        function.printNumbers(1, 2, 3, 4, 5, 6, 3, 1, 2, 4, 5);

    }

    // Ejercicios

    @SuppressWarnings("unused")
    private static void executeFibonacciSequence() {
        FibonacciErick.createSequence(5);
        FibonacciMex.createSequence(1);
        FibonacciKevin.createSequence(5);
        FibonacciPaulina.createSequence(1);
    }
}
