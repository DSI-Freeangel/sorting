package fa.arrays.sort.algorithm;

import fa.arrays.sort.TestUtils;
import org.junit.Test;

public class BubbleSortAlgorithmTest {
    public static final int SIZE = 100;

    @Test
    public void sortSuccessful() {
        Integer[] array = TestUtils.generateRandomArray(SIZE);
        BubbleSortAlgorithm<Integer> algorithm = new BubbleSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnEmptyArray() {
        Integer[] array = {};
        BubbleSortAlgorithm<Integer> algorithm = new BubbleSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnSortedArray() {
        Integer[] array = TestUtils.generateSortedArray(SIZE);
        BubbleSortAlgorithm<Integer> algorithm = new BubbleSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }
}