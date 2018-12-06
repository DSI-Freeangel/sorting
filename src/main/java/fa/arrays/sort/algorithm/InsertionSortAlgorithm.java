package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Comparator;

public class InsertionSortAlgorithm<T> implements SortingAlgorithm<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        T temp;
        int j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && comparator.compare(array[j], temp) > 0; j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}
