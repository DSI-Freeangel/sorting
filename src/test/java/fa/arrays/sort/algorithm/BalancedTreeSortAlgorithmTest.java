package fa.arrays.sort.algorithm;

import fa.arrays.sort.TestUtils;
import org.junit.Test;

public class BalancedTreeSortAlgorithmTest {

    public static final int SIZE = 100;

    @Test
    public void sortSuccessful() {
        Integer[] array = TestUtils.generateRandomArray(SIZE);
        BalancedTreeSortAlgorithm<Integer> algorithm = new BalancedTreeSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnEmptyArray() {
        Integer[] array = {};
        BalancedTreeSortAlgorithm<Integer> algorithm = new BalancedTreeSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }

    @Test
    public void sortOnSortedArray() {
        Integer[] array = TestUtils.generateSortedArray(SIZE);
        BalancedTreeSortAlgorithm<Integer> algorithm = new BalancedTreeSortAlgorithm<>();
        algorithm.sort(array, Integer::compareTo);
        TestUtils.verifySorted(array);
    }
}