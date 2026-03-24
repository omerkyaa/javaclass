package amazon.week1.loops;

public class ShoppingListManager {

    public static void main(String[] args) {

        // items and prices
        String[] items = {"Milk", "Bread", "Eggs", "Cheese", "Apple"};
        double[] prices = {1.5, 2.0, 3.2, 4.5, 1.2};

        // total cost
        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        // most expensive & cheapest
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[maxIndex]) {
                maxIndex = i;
            }

            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            }
        }

        // display list
        System.out.println("Shopping List:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + "€");
        }

        System.out.println("-------------------");
        System.out.println("Total cost: " + total + "€");

        System.out.println("Most expensive: "
                + items[maxIndex] + " - " + prices[maxIndex] + "€");

        System.out.println("Cheapest: "
                + items[minIndex] + " - " + prices[minIndex] + "€");
    }
}