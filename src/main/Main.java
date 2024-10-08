package main;

import tests.testZero.*;
import classes.types.Type;
import classes.conditionals.*;
import classes.functions.Function;
import classes.loops.Loop;

//* 5579 0701 3143 8049 Tarjeta debito Tia elia

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

        function.add(0, 0);

        function.add(0.2, 0.2);

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
