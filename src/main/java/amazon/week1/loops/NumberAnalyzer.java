package amazon.week1.loops;

public class NumberAnalyzer {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        // sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // average
        double average = (double) sum / numbers.length;

        // max and min
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // print results
        System.out.println("Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
    }
}