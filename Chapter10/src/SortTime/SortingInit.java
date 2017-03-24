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
        long start = System.currentTimeMillis();
        Bubble bubble = new Bubble(array);
        bubble.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public double selectionSortingTime() {
        long start = System.currentTimeMillis();
        Selection selection = new Selection(array);
        selection.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public double insertionSortingTime() {
        long start = System.currentTimeMillis();
        Insertion insertion = new Insertion(array);
        insertion.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }


    public double heapSortingTime() {
        long start = System.currentTimeMillis();
        Heap heap = new Heap(array);
        heap.insert();
        heap.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }


    public double mergeSortingTime() {
        long start = System.currentTimeMillis();
        Merge merge = new Merge(array);
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public double quickSortingTime() {
        long start = System.currentTimeMillis();
        Quick quick = new Quick(array);
        long end = System.currentTimeMillis();

        return (end - start);
    }


    public double radixSortingTime() {
        long start = System.currentTimeMillis();
        Radix radix = new Radix(array);
        radix.sorting();
        long end = System.currentTimeMillis();

        return (end - start);
    }
}
