package fa.arrays.sort.tree;

import java.util.Comparator;
import java.util.function.Consumer;

public class Tree<T> {
    private Node<T> root;

    public Tree insert(T v, Comparator<T> comparator) {
        root = insert(root, v, comparator);
        return this;
    }

    private Node insert(Node<T> root, T v, Comparator<T> comparator) {
        if (root == null) {
            root = new Node<>();
            root.value = v;
        } else if (comparator.compare(v, root.value) < 0) {
            root.left = insert(root.left, v, comparator);
        } else {
            root.right = insert(root.right, v, comparator);
        }

        return root;
    }

    public void forEach(Consumer<T> consumer) {
        forEach(root, consumer);
    }

    private void forEach(Node<T> root, Consumer<T> consumer) {
        if (root == null) {
            return;
        }
        forEach(root.left, consumer);
        consumer.accept(root.value);
        forEach(root.right, consumer);
    }
}