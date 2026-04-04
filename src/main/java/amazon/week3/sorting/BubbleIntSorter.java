package amazon.week3.sorting;

public class BubbleIntSorter implements IntSorter{


    @Override
    public int[] sort(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < (numbers.length-1); i++) {
                if (numbers[i] > numbers[i+1]){

                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;

                }
            }
        }

        return numbers;
    }
}
