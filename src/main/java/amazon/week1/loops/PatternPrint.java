package amazon.week1.loops;

public class PatternPrint {

    public static void main(String[] args) {

        int size = 5; // change this to see different sizes

        // 1. Triangle of stars
        System.out.println("Triangle:");
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // 2. Square of numbers
        System.out.println("Square:");
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        // 3. Pyramid
        System.out.println("Pyramid:");
        for (int i = 1; i <= size; i++) {

            // spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}