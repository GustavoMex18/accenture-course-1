package classes.types;

public class Type {

    private int firstValue = 3;

    private int secondValue = 2;


    public boolean showComparison(String operator) {

        switch (operator) {
            case ">":
                return firstValue > secondValue;
            case "<":
                return firstValue < secondValue;
            case "==":
                return firstValue == secondValue;
            case ">=":
                return firstValue >= secondValue;
            case "<=":
                return firstValue <= secondValue;
            case "!=":
                return firstValue != secondValue;
            default:
                System.out.println("Not valid operator");
                return false;
        }

    }
}
