package fa.arrays.sort.algorithm;

import fa.arrays.sort.SortingAlgorithm;
import fa.arrays.sort.tree.Tree;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class TreeSortAlgorithm<T> implements SortingAlgorithm<T> {

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        Tree<T> tree = new Tree<>();
        for(int i = 0; i < array.length; i++) {
            tree.insert(array[i], comparator);
        }
        AtomicInteger i = new AtomicInteger(- 1);
        tree.forEach((value) -> {
            array[i.incrementAndGet()] = value;
        });
    }
}
