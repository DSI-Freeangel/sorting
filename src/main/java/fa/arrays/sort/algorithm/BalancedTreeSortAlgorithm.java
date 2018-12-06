package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;
import fa.arrays.sort.tree.Tree;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class BalancedTreeSortAlgorithm<T> implements SortingAlgorithm<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if(array.length == 0) {
            return;
        }
        Tree<T> tree = new Tree<>();
        fillTree(array, comparator, tree, 0, array.length - 1);
        AtomicInteger i = new AtomicInteger(- 1);
        tree.forEach((value) -> {
            array[i.incrementAndGet()] = value;
        });
    }

    private void fillTree(T[] array, Comparator<T> comparator, Tree<T> tree, int start, int end) {
        if(start == end) {
            tree.insert(array[start], comparator);
        } else {
            int middle = (start + end) / 2;
            tree.insert(array[middle], comparator);
            if(start < middle ) {
                fillTree(array, comparator, tree, start, middle - 1);
            }
            if(middle < end) {
                fillTree(array, comparator, tree, middle + 1, end);
            }
        }
    }
}
