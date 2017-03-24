package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Quick {
    private int[] array;

    public Quick(int[] array) {
        this.array = array;
        sorting(array, 0, array.length - 1);
    }

    public void sorting(int[] array, int left, int right) {
        int low = left;
        int high = right;
        int pivot = array[(left + right) / 2];

        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }

            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }
        if (left <= high) {
            sorting(array, left, high);
        }
        if (right > low) {
            sorting(array, low, right);
        }
    }
}
