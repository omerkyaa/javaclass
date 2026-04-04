package amazon.week3.sorting;

import java.util.Arrays;

public class QuickIntSorter implements IntSorter{


    @Override
    public int[] sort(int[] numbers) {
        return Arrays.stream(numbers).sorted().toArray();
    }
}
