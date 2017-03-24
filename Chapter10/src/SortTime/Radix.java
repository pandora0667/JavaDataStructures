package SortTime;

import java.util.LinkedList;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Radix {
    private int[] array;
    private LinkedList<Integer>[] counter = new LinkedList[] {  // 버킷으로 사용
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>()};

    public Radix(int[] array) {
        this.array = array;
    }

    public void sorting() {
        sortLSD(array, 5);
    }

    public void sortLSD(int[] array, int maxDigitSymbols) {
        int mod = 10;
        int dev = 1;

        for (int i=0; i<maxDigitSymbols; i++, dev*=10, mod *=10) {
            for (int j=0; j<array.length; j++) {
                int bucket = (array[j] % mod) / dev;
                counter[bucket].add(array[j]);
            }

            int pos = 0;
            for (int j=0; j<counter.length; j++) {
                Integer value;
                while ((value=counter[j].poll()) != null) { // poll
                    array[pos++] = value;
                }
            }
        }
    }



}
