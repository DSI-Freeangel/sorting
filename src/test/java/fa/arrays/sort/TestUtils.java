package fa.arrays.sort;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class TestUtils {

    public static void verifySorted(Comparable[] array) {
        if(array.length == 0) {
            return;
        }
        Comparable lastValue = array[0];
        for(int i = 1; i < array.length; i++) {
            assertTrue(lastValue.compareTo(array[i]) <= 0);
            lastValue = array[i];
        }
    }

    public static Integer[] generateRandomArray(int size) {
        Random random = new Random();
        Integer[] integers = new Integer[size];
        for(int i = 0; i < size; i++) {
            integers[i] = random.nextInt(size);
        }
        return integers;
    }

    public static Integer[] generateSortedArray(int size) {
        Integer[] integers = new Integer[size];
        for(int i = 0; i < size; i++) {
            integers[i] = i;
        }
        return integers;
    }

    public static Integer[] copy(Integer[] original) {
        Integer[] copy = new Integer[original.length];
        for(int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

}
