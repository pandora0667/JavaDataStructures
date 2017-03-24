package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Heap {
    private int[] array;
    private int[] heapArray;

    public Heap(int[] array) {
        this.array = array;
        this.heapArray = new int[array.length+1];
    }

    public void insert() {
        for (int i=1; i<array.length; i++) {
            heapArray[i] = array[i-1];
            int tmpInt;
            int tmpIndex = i;
            while ((tmpIndex != 1) && heapArray[tmpIndex] > heapArray[tmpIndex/2]) {
                tmpInt = heapArray[tmpIndex];
                heapArray[tmpIndex] = heapArray[tmpIndex/2];
                heapArray[tmpIndex/2] = tmpInt;
                tmpIndex /= 2;
            }
        }
    }

    public void sorting() {
        int size = heapArray.length-1;

        while (size > 0) {
            int root = 1;
            int sub = 2;
            int tmpData;
            heapArray[root] = heapArray[size];
            size--;

            while (sub <= size) {
                if (sub<size && heapArray[sub]<heapArray[sub+1]) {
                    sub++;
                }
                if (heapArray[root] >= heapArray[size]) {
                    break;
                }

                tmpData = heapArray[root];
                heapArray[root] = heapArray[sub];
                heapArray[sub] = tmpData;
                sub*=2;
            }
        }
    }
}
