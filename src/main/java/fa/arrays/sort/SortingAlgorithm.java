package fa.arrays.sort;

import java.util.Comparator;

public interface SortingAlgorithm<T> {

    void sort(T[] array, Comparator<T> comparator);
}
