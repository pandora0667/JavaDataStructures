package SortTime;

import java.util.Random;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class SortingInit {
    private Random random = new Random();
    private int[] array;
    private double time;

    public SortingInit(int length) {
        array = new int[length];
        this.time = 0.0;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }


    public void ArrayCreating() {
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt() % 100000;
            if (number < 0) {
                number *= -1;
            }
            array[i] = number;
        }
    }

    public double bubbleSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Bubble bubble = new Bubble(copy);
        bubble.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public double selectionSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Selection selection = new Selection(copy);
        selection.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public double insertionSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Insertion insertion = new Insertion(copy);
        insertion.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }


    public double heapSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Heap heap = new Heap(copy);
        heap.insert();
        heap.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }


    public double mergeSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Merge merge = new Merge(copy);
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public double quickSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Quick quick = new Quick(copy);
        long end = System.currentTimeMillis();

        return (end - start);
    }


    public double radixSortingTime() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        long start = System.currentTimeMillis();
        Radix radix = new Radix(copy);
        radix.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }
}
