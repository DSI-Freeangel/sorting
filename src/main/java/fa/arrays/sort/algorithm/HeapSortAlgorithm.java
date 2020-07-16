package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;

import java.util.Comparator;

public class HeapSortAlgorithm<T> implements SortingAlgorithm<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        int count = array.length;
        for (int i = count / 2 - 1; i >= 0; i--) {
            heapify(array, comparator, i, count);
        }

        for(int i = count - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, comparator, 0, i);
        }
    }

    private void heapify(T[] array, Comparator<T> comparator, int root, int length) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;

        int largest = root;

        if(left < length && comparator.compare(array[left], array[largest]) > 0) {
            largest = left;
        }

        if(right < length && comparator.compare(array[right], array[largest]) > 0) {
            largest = right;
        }

        if(largest != root) {
            swap(array, largest, root);
            heapify(array, comparator, largest, length);
        }

    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
