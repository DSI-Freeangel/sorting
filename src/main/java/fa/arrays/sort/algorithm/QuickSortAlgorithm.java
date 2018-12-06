package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Comparator;

public class QuickSortAlgorithm<T> implements SortingAlgorithm<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        sort(array, comparator, 0, array.length - 1);
    }

    private void sort(T[] array, Comparator<T> comparator, int first, int last) {
        if(first > last) {
            return;
        }
        int i = partition(array, comparator, first, last);
        sort(array, comparator, first, i-1);
        sort(array, comparator, i + 1, last);
    }

    private int partition(T[] array, Comparator<T> comparator, int first, int last) {
        T x = array[last];
        int i = first;
        for(int j = first; j < last; j++) {
            if(comparator.compare(array[j], x) <= 0) {
                swap(array, i++, j);
            }
        }
        swap(array, i, last);
        return i;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
