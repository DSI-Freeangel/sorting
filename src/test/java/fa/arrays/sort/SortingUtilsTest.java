package fa.arrays.sort;

import org.junit.Test;

public class SortingUtilsTest {
    private static final int SIZE = 100_000;
    private static final int ATTEMPTS_COUNT = 100;

    @Test
    public void quickSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(SIZE, SortType.QUICK_SORT);
        System.out.println(String.format("Quick Sort time = %s ms", avgTime));
    }

    @Test
    public void treeSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(SIZE, SortType.TREE_SORT);
        System.out.println(String.format("Tree Sort time = %s ms", avgTime));
    }

    @Test
    public void balancedTreeSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(SIZE, SortType.BALANCED_TREE_SORT);
        System.out.println(String.format("Balanced tree Sort time = %s ms", avgTime));
    }

    @Test
    public void selectionSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(1);
        long avgTime = evaluator.sort(SIZE, SortType.SELECTION_SORT);
        System.out.println(String.format("Selection Sort time = %s ms", avgTime));
    }

    @Test
    public void insertionSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(1);
        long avgTime = evaluator.sort(SIZE, SortType.INSERTION_SORT);
        System.out.println(String.format("Insertion Sort time = %s ms", avgTime));
    }

    @Test
    public void bubbleSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(1);
        long avgTime = evaluator.sort(SIZE, SortType.BUBBLE_SORT);
        System.out.println(String.format("Bubble Sort time = %s ms", avgTime));
    }

    @Test
    public void mergeSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(SIZE, SortType.MERGE_SORT);
        System.out.println(String.format("Merge Sort time = %s ms", avgTime));
    }

    @Test
    public void heapSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(SIZE, SortType.HEAP_SORT);
        System.out.println(String.format("Heap Sort time = %s ms", avgTime));
    }

    @Test
    public void radixSort() {
        AverageSortTimeEvaluator evaluator = new AverageSortTimeEvaluator(ATTEMPTS_COUNT);
        long avgTime = evaluator.sort(SIZE, SortType.RADIX_SORT);
        System.out.println(String.format("Radix Sort time = %s ms", avgTime));
    }

}