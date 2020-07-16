package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class RadixSortAlgorithm<T> implements SortingAlgorithm<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array.length == 0) {
            return;
        }
        if (!(array[0] instanceof Integer)) {
            throw new IllegalArgumentException("Unsupported type for this kind of sort algorithm");
        }
        Integer[] inputArray = (Integer[]) array;
        Integer max = getMax(inputArray);

        int sign = 1;
        while (max / sign > 0) {
            sign *= 10;
        }
        sort(inputArray, 0, inputArray.length - 1, sign/10);
    }

    private Integer getMax(Integer[] array) {
        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private void sort(Integer[] array, int min, int max, int sign) {
        if(sign == 0) {
            return;
        }
        int[] counts = new int[10];
        int[] indexes = new int[10];
        Arrays.fill(counts, 0);
        Integer[] result = new Integer[max - min + 1];

        for (int i = min; i <= max; i++) {
            counts[(array[i] / sign) % 10]++;
        }
        indexes[0] = counts[0];
        for (int i = 1; i < 10; i++) {
            indexes[i] = counts[i];
            indexes[i] += indexes[i - 1];
        }

        for (int i = max; i >= min; i--) {
            int j = (array[i] / sign) % 10;
            result[indexes[j] - 1] = array[i];
            indexes[j]--;
        }

        for (int i = min; i <= max; i++) {
            array[i] = result[i - min];
        }
        int next = min;
        for(int i = 0; i < 10; i++) {
            if(counts[i] > 1) {
                sort(array, next, next+counts[i] - 1, sign/10);
            }
            next+=counts[i];
        }
    }

}
