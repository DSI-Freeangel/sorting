package fa.arrays.sort.algorithm;

import fa.arrays.sort.TestUtils;
import org.junit.Test;

public class InsertionSortAlgorithmTest {
    public static final int SIZE = 100;

    @Test
    public void sortSuccessful() {
        Integer[] array = TestUtils.generateRandomArray(SIZE);
        InsertionSortAlgorithm<Integer> algorithm = new InsertionSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnEmptyArray() {
        Integer[] array = {};
        InsertionSortAlgorithm<Integer> algorithm = new InsertionSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnSortedArray() {
        Integer[] array = TestUtils.generateSortedArray(SIZE);
        InsertionSortAlgorithm<Integer> algorithm = new InsertionSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }
}