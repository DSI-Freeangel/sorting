package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Comparator;

public class BubbleSortAlgorithm<T> implements SortingAlgorithm<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if(array.length == 0) {
            return;
        }
        int sortedCount = 0;
        boolean sorted;
        do {
            sorted = false;
            for(int i = 1; i < array.length - sortedCount; i++) {
                if(comparator.compare(array[i-1], array[i]) > 0) {
                    swap(array, i-1, i);
                    sorted = true;
                }
            }
            sortedCount++;
        } while(sorted);
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
