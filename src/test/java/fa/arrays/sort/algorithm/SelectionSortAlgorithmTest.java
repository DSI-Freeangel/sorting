package fa.arrays.sort.algorithm;

import fa.arrays.sort.TestUtils;
import org.junit.Test;

public class SelectionSortAlgorithmTest {
    public static final int SIZE = 100;

    @Test
    public void sortSuccessful() {
        Integer[] array = TestUtils.generateRandomArray(SIZE);
        SelectionSortAlgorithm<Integer> algorithm = new SelectionSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnEmptyArray() {
        Integer[] array = {};
        SelectionSortAlgorithm<Integer> algorithm = new SelectionSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnSortedArray() {
        Integer[] array = TestUtils.generateSortedArray(SIZE);
        SelectionSortAlgorithm<Integer> algorithm = new SelectionSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }
}