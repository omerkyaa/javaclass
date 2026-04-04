package amazon.week2.Exercises;

import java.util.Random;

public class BubbleSort {

    int size = 10 ;
    int [] numbers = new int[size];


    public void fillNumbers() {

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

    }

    public void printNumbers() {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

    }
    public void sortNumbers() {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < (numbers.length-1); i++) {
                if (numbers[i] > numbers[i+1]){

                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;

                }
            }
        }



    }


    static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Before Sorting");
        bubbleSort.fillNumbers();
        bubbleSort.printNumbers();












    }



}
