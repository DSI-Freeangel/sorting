package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Comparator;

public class MergeSortAlgorithm<T> implements SortingAlgorithm<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        sort(array, comparator, 0, array.length - 1);
    }

    public void sort(T[] array, Comparator<T> comparator, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            sort(array, comparator, start, middle);
            sort(array, comparator, middle + 1, end);
            merge(array, comparator, start, middle, end);
        }
    }

    private void merge(T[] array, Comparator<T> comparator, int start, int middle, int end) {
        int firstSize = middle - start + 1;
        int secondSize = end - middle;

        T[] first = (T[])new Object[firstSize];
        T[] second = (T[])new Object[secondSize];
        for (int i = 0; i < firstSize; i++) {
            first[i] = array[i+start];
        }
        for (int i = 0; i < secondSize; i++) {
            second[i] = array[i+middle+1];
        }

        int i = 0, j = 0;
        int k = start;
        while (i < firstSize && j < secondSize) {
            if(comparator.compare(second[j], first[i]) > 0) {
                array[k++] = first[i++];
            } else {
                array[k++] = second[j++];
            }
        }
        while(i < firstSize) {
            array[k++] = first[i++];
        }
        while(j < secondSize) {
            array[k++] = second[j++];
        }
    }
}
