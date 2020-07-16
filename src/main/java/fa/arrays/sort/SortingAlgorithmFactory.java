package fa.arrays.sort;

import fa.arrays.sort.algorithm.*;

public class SortingAlgorithmFactory {

    public static <T> SortingAlgorithm<T> find(SortType algorithmType) {
        SortingAlgorithm<T> algorithm;
        switch (algorithmType) {
            case QUICK_SORT: algorithm = new QuickSortAlgorithm<>(); break;
            case TREE_SORT: algorithm = new TreeSortAlgorithm<>(); break;
            case BALANCED_TREE_SORT: algorithm = new BalancedTreeSortAlgorithm<>(); break;
            case SELECTION_SORT: algorithm = new SelectionSortAlgorithm<>(); break;
            case INSERTION_SORT: algorithm = new InsertionSortAlgorithm<>(); break;
            case BUBBLE_SORT: algorithm = new BubbleSortAlgorithm<>(); break;
            case MERGE_SORT: algorithm = new MergeSortAlgorithm<>(); break;
            case HEAP_SORT: algorithm = new HeapSortAlgorithm<>(); break;
            case RADIX_SORT: algorithm = new RadixSortAlgorithm<>(); break;
            default: throw new IllegalArgumentException("Unsupported algorithm");
        }
        return algorithm;
    }
}
