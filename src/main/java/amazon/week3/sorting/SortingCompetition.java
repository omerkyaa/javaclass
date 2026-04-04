package amazon.week3.sorting;

import java.util.Random;

public class SortingCompetition {

    int size = 100 ;
    int[] numbersAlg1 = new int[size];
    int[] numbersAlg2 = new int[size];


    public void fillNumbers() {

        Random random = new Random();

        for (int i = 0; i < numbersAlg1.length; i++) {
            int temp = random.nextInt(1000000);
            numbersAlg1[i] = temp;
            numbersAlg2[i] = temp;
        }

    }

    public void printNumbers() {

        for(int i = 0; i < numbersAlg1.length; i++) {
            System.out.print(numbersAlg1[i] + " ");
        }

        //System.out.println();

        for(int i = 0; i < numbersAlg2.length; i++) {
            System.out.print(numbersAlg2[i] + " ");
        }

        //System.out.println();

    }


    static void main(String[] args) {

        SortingCompetition sortingCompetition = new SortingCompetition();
        //System.out.println("Before Sorting");

        //sortingCompetition.fillNumbers();
        //sortingCompetition.printNumbers();

        IntSorter bubbleSort = new BubbleIntSorter();
        long beforeBS = System.currentTimeMillis();
        bubbleSort.sort(sortingCompetition.numbersAlg1);
        long afterBS = System.currentTimeMillis();

        //System.out.println("After Sorting");
        //sortingCompetition.printNumbers();

        IntSorter quickSort = new QuickIntSorter();
        long beforeQS = System.currentTimeMillis();
        sortingCompetition.numbersAlg2 = quickSort.sort(sortingCompetition.numbersAlg2);
        long afterQS = System.currentTimeMillis();

        //System.out.println("After Sorting");
        //sortingCompetition.printNumbers();

        System.out.println("BubbleSort needs " + (afterBS - beforeBS) + "ms");
        System.out.println("QuickSort needs " + (afterQS - beforeQS) + "ms");





    }










}
