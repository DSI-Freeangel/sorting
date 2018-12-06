package fa.arrays.sort;

import java.util.Comparator;

public class SortingUtils {

    public static <T> void sort(T[] array, Comparator<T> comparator, SortType algorithmType) {
        SortingAlgorithm<T> algorithm = SortingAlgorithmFactory.find(algorithmType);
        algorithm.sort(array, comparator);
    }

}
