package fa.arrays.sort;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class AverageSortTimeEvaluator {
    private final int retryCount;
    private long totalMs = 0;

    public AverageSortTimeEvaluator(int retryCount) {
        this.retryCount = retryCount;
    }

    public long sort(int size, SortType sortType) {
        for(int i = 0; i < retryCount; i ++) {
            Integer[] array = TestUtils.generateRandomArray(size);
            Stopwatch timer = Stopwatch.createStarted();
            SortingUtils.sort(array, Integer::compareTo, sortType);
            timer.stop();
            totalMs += timer.elapsed(TimeUnit.MILLISECONDS);
            TestUtils.verifySorted(array);
        }
        return totalMs / retryCount;
    }
}
