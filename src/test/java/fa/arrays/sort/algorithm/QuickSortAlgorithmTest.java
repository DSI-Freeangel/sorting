package fa.arrays.sort.algorithm;

import fa.arrays.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortAlgorithmTest {

    public static final int SIZE = 100;

    @Test
    public void sortSuccessful() {
        Integer[] array = TestUtils.generateRandomArray(SIZE);
        QuickSortAlgorithm<Integer> algorithm = new QuickSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnEmptyArray() {
        Integer[] array = {};
        QuickSortAlgorithm<Integer> algorithm = new QuickSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnSortedArray() {
        Integer[] array = TestUtils.generateSortedArray(SIZE);
        QuickSortAlgorithm<Integer> algorithm = new QuickSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }
}