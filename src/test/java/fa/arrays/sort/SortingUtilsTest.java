package fa.arrays.sort;

import org.junit.Test;

public class SortingUtilsTest {
    private static final int SIZE = 100_000;
    private static final int ATTEMPTS_COUNT = 100;
    private static final Integer[] ARRAY = TestUtils.generateRandomArray(SIZE);

    @Test
    public void quickSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(ARRAY, SortType.QUICK_SORT);
        System.out.println(String.format("Quick Sort time = %s ms", avgTime));
    }

    @Test
    public void treeSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(ARRAY, SortType.TREE_SORT);
        System.out.println(String.format("Tree Sort time = %s ms", avgTime));
    }

    @Test
    public void balancedTreeSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(ARRAY, SortType.BALANCED_TREE_SORT);
        System.out.println(String.format("Balanced tree Sort time = %s ms", avgTime));
    }

    @Test
    public void selectionSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(1);
        long avgTime = evaluator.sort(ARRAY, SortType.SELECTION_SORT);
        System.out.println(String.format("Selection Sort time = %s ms", avgTime));
    }

    @Test
    public void insertionSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(1);
        long avgTime = evaluator.sort(ARRAY, SortType.INSERTION_SORT);
        System.out.println(String.format("Insertion Sort time = %s ms", avgTime));
    }

    @Test
    public void bubbleSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(1);
        long avgTime = evaluator.sort(ARRAY, SortType.BUBBLE_SORT);
        System.out.println(String.format("Bubble Sort time = %s ms", avgTime));
    }

}