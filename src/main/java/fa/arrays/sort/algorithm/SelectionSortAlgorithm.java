package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Comparator;

public class SelectionSortAlgorithm<T> implements SortingAlgorithm<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(comparator.compare(array[j], array[min]) < 0) {
                    min = j;
                }
            }
            if(i != min) {
                swap(array, i, min);
            }
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
