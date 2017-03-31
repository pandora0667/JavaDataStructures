package Interpolation;

/**
 * Created by seongwonlee on 2017. 3. 26..
 */
public class InterpolationSearch {
    private int[] array;

    public InterpolationSearch(int[] array) {
        this.array = array;
        sorting(array, 0, array.length - 1);
    }

    private void sorting(int[] array, int left, int right) {
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



    public int interpolation(int target) {
        int low = 0;
        int high = array.length - 1;

        while (array[high] != array[low] && target >= array[low] && target <= array[high]) {
            int mid = low + (target - array[low]) * (high - low) / (array[high] - array[low]);

            if (array[mid] < target) {
                low = mid + 1;
            } else if (target < array[mid]) {
                high = mid - 1;
            } else {
                return array[mid];
            }
        }

        if (target == array[low]) {
            return array[low];
        } else {
            return -1;
        }
    }
}