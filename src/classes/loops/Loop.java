package classes.loops;

public class Loop {

    public void forLoop(int length, int stepSize) {
        for (int index = 0; index < length; index += stepSize) {
            System.out.println("For: " + index);
        }
    }

    public void whileLoop(int length, int stepSize) {
        int index = 0;
        while (index < length) {
            System.out.println("While: " + index);
            index += stepSize;
        }
    }

    public void whileLoop(boolean decision) {
        while (decision) {
            System.out.println("While: " + decision);
        }
    }

    public void doWhileLoop(int length, int stepSize) {
        int index = 0;
        do {
            System.out.println("Do While: " + index);
            index += stepSize;
        } while (index < length);
    }

    public void doWhileLoop(boolean decision) {
        do {
            System.out.println("Do While: " + decision);
        } while (decision);
    }

}
