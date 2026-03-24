package amazon.week1.loops;

public class NumberAnalyzerGame {

    public static void main(String[] args) {

        int[] numbers = {3, 8, 12, 17, 21, 24, 30, 35, 42, 50};

        int evenCount = 0;
        int greaterCount = 0;
        int rangeCount = 0;

        int greaterThan = 20;
        int minRange = 10;
        int maxRange = 30;

        System.out.println("=== NUMBER ANALYZER GAME ===");
        System.out.println();

        System.out.print("All numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evenCount++;
            }
        }

        System.out.println();
        System.out.println("Found even numbers: " + evenCount);
        System.out.println();

        System.out.print("Numbers greater than " + greaterThan + ": ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greaterThan) {
                System.out.print(numbers[i] + " ");
                greaterCount++;
            }
        }

        System.out.println();
        System.out.println("Found greater numbers: " + greaterCount);
        System.out.println();

        System.out.print("Numbers between " + minRange + " and " + maxRange + ": ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= minRange && numbers[i] <= maxRange) {
                System.out.print(numbers[i] + " ");
                rangeCount++;
            }
        }

        System.out.println();
        System.out.println("Found numbers in range: " + rangeCount);
    }
}