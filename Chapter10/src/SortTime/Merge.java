package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Merge {
    private int[] array;

    public Merge(int[] array) {
        this.array = array;
        sorting(array, 0, array.length-1);
    }

    public void sorting(int[] array, int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right)/2;

            sorting(array, left, mid);
            sorting(array, mid+1, right);
            mergeToArea(array, left, mid, right);
        }
    }

    public void mergeToArea(int[] array, int left, int mid, int right) {
        int[] mergeArray = new int[array.length];
        int frontIndex = left;
        int rearIndex = mid+1;
        int sortIndex = left;

        while (frontIndex < mid && rearIndex <= right) {
            if (array[frontIndex] <= array[rearIndex]) {
                mergeArray[sortIndex] = array[frontIndex++];
            } else {
                mergeArray[sortIndex] = array[rearIndex++];
            }
            sortIndex++;
        }

        if (frontIndex > mid) {
            for (int i=rearIndex; i<=right; i++, sortIndex++) {
                mergeArray[sortIndex] = array[i];
            }
        } else {
            for (int i=frontIndex; i<=mid; i++, sortIndex++) {
                mergeArray[sortIndex] = array[i];
            }
        }

        for (int i=left; i<=right; i++) {
            array[i] = mergeArray[i];
        }
    }
}
