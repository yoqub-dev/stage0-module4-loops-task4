package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith) {
            System.out.println("Iterating till the end:");
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Iterating till the number to break with:");
            for (int i = 1; i <= toBreakWith; i++) {
                System.out.println(i);
            }
        }
    }
}
